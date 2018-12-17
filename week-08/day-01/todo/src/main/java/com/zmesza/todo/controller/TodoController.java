package com.zmesza.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @GetMapping(value = {"/", "/list"})
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }

  //Add a public String list() method which maps to / and /list in the controller,
  // which returns with "This is my first Todo" string. Use the @ResponseBody annotation.
}
