package com.zmesza.toread.controller;

import com.zmesza.toread.model.Book;
import com.zmesza.toread.model.User;
import com.zmesza.toread.service.BookService;
import com.zmesza.toread.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

  private BookService bookService;
  private UserService userService;

  @Autowired
  public BookController(BookService bookService, UserService userService) {
    this.bookService = bookService;
    this.userService = userService;
  }

  @GetMapping(value = "/")
  public String list(Model model, @RequestParam(value = "unRead", required = false) boolean unread) {
    if (unread) {
      model.addAttribute("listOfBooks", bookService.getUnReadBooks());
    } else {
      model.addAttribute("listOfBooks", bookService.getAllBooks());
    }
    return "index";
  }

  @GetMapping(value = "/addbook")
  public String getItemPage(Model model) {
    model.addAttribute("book", new Book());
    model.addAttribute("user", this.userService.getAllUser());
    return "addbook";
  }

  @PostMapping(value = "/addbook")
  public String getItem(@ModelAttribute Book book) {
    this.bookService.saveNewBook(book);
    return "redirect:/";
  }

  @PostMapping(value = "/{id}/delete")
  public String deleteItem(@PathVariable int id) {
    this.bookService.deleteBookById(id);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/edit")
  public String editItemPage(@PathVariable int id, Model model) {
    model.addAttribute("book", this.bookService.getBookById(id));
    model.addAttribute("user", this.userService.getAllUser());
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String editItem(@PathVariable int id, @ModelAttribute Book book) {
    this.bookService.saveNewBook(book);
    return "redirect:/";
  }

  @GetMapping(value = "/users")
  public String listUsers(Model model) {
    model.addAttribute("users", this.userService.getAllUser());
    return "users";
  }

  @GetMapping(value = "/users/{id}/edit")
  public String editUserPage(@PathVariable long id, Model model) {
    model.addAttribute("user", this.userService.getUserById(id));
    return "edituser";
  }

  @PostMapping(value = "/users/{id}/edit")
  public String editUser(@ModelAttribute User user) {
    this.userService.saveNewUser(user);
    return "redirect:/users";
  }

  @GetMapping(value = "/users/adduser")
  public String addUserPage(Model model) {
    model.addAttribute("user", new User());
    return "adduser";
  }

  @PostMapping(value = "/users/adduser")
  public String addUser(@ModelAttribute User user) {
    this.userService.saveNewUser(user);
    return "redirect:/users";
  }
}
