package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWebCounterController {
  AtomicLong incId = new AtomicLong(1);

  @RequestMapping(value="/web/greeting")
  @ResponseBody
  public String greeting(@RequestParam String name) {
    Greeting hi = new Greeting(incId.getAndIncrement(), "Hello " + name);
    return hi.getContent() + "! This site was loaded " + incId + "times since last server start.";
  }
}
