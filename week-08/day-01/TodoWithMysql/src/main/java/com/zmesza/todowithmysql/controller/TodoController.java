package com.zmesza.todowithmysql.controller;

import com.zmesza.todowithmysql.repository.Todo;
import com.zmesza.todowithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
//    repository.save(new Todo("Buy more milk!"));
//    repository.save(new Todo("MORE MILK"));
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todos :: add);
    model.addAttribute("todos", todos);
    return "todolist";
  }
}
