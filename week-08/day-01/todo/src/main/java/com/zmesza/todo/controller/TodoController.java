package com.zmesza.todo.controller;

import com.zmesza.todo.model.Todo;
import com.zmesza.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  public TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService){
    this.todoService = todoService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam (value="isActive", required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute(todoService.getActiveTodo());
    } else {
      model.addAttribute(todoService.getAllTodo());
    }
    return "todolist";
  }

  @GetMapping(value = "/addtodo")
  public String newItemPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "/addtodo";
  }

  @PostMapping(value = "/addtodo")
  public String newItem(@ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/";
  }

  @PostMapping(value = "/{id}/delete")
  public String deleteItem(@PathVariable long id) {
    todoService.deleteTodoById(id);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/edit")
  public String editItemPage(Model model, @PathVariable long id) {
    model.addAttribute("todo", todoService.getTodoById(id));
    return "edittodo";
  }
  @PostMapping(value = "/{id}/edit")
  public String editItem(@ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/";

  }
}
