package com.zmesza.todowithmysql.controller;

import com.zmesza.todowithmysql.repository.Todo;
import com.zmesza.todowithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

  @GetMapping(value = "/todo/{isDone}")
  public String listOfNotDone(@RequestParam("isDone") boolean isDone, Model model) {
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todo -> {
      if(!todo.getIsDone()) {
        todos.add(todo);
      }
    });
    model.addAttribute("todos", todos);
    return "todolist";
  }
}
