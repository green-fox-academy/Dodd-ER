package com.zmesza.todo.controller;

import com.zmesza.todo.repository.TodoRepository;
import com.zmesza.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  public TodoRepository repository;

  @Autowired
  public TodoController(TodoRepository repository){
    this.repository = repository;
  }

  @GetMapping(value = {"/", "/list"})
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }
}
