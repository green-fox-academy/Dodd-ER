package com.zmesza.frontend.controller;

import com.zmesza.frontend.model.*;
import com.zmesza.frontend.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class JSonController {

  private MainService service;

  @Autowired
  public JSonController(MainService service) {
    this.service = service;
  }

  @GetMapping(value = "/doubling")
  public Object getDoublingFunction(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new InputNumber(input);
    } else {
      return new DoublingMessage();
    }
  }

  @GetMapping(value = "/greeter")
  public Object getGreetingFunction(@RequestParam (value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {

    if (name == null || title == null) {
      return new GreetingMessage(name, title);
    } else {
      return new Person(name, title);
    }
  }

  @GetMapping(value = "appenda/{appendable}")
  public Object getAppendAFunction(@PathVariable String appendable) {
    return new WordToAppend(appendable);
  }

}
