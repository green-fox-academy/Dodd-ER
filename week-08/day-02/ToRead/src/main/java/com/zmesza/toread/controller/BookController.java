package com.zmesza.toread.controller;

import com.zmesza.toread.model.Book;
import com.zmesza.toread.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

  private BookServiceImpl bookService;

  @Autowired
  public BookController(BookServiceImpl bookService) {
    this.bookService = bookService;
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
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String editItem(@PathVariable int id, @ModelAttribute Book book) {
    this.bookService.saveNewBook(book);
    return "redirect:/";
  }
}
