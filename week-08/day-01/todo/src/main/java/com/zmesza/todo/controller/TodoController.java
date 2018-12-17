package com.zmesza.todo.controller;

import com.zmesza.todo.repository.Todo;
import com.zmesza.todo.repository.TodoRepository;
import com.zmesza.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  public TodoRepository repository;

  @Autowired
  public TodoController(TodoRepository repository){
    this.repository = repository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    repository.save(new Todo("Buy more milk!"));
    repository.save(new Todo("MORE MILK"));
    model.addAttribute("title", repository.findAll());
    return "todolist";
  }
}
