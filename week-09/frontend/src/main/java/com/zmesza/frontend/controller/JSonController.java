package com.zmesza.frontend.controller;

import com.zmesza.frontend.model.*;
import com.zmesza.frontend.service.LogService;
import com.zmesza.frontend.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JSonController {

  private LogService logservice;

  @Autowired
  public JSonController(LogService logservice) {
    this.logservice = logservice;
  }

  @GetMapping(value = "/doubling")
  public Object getDoublingFunction(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      this.logservice.saveLogEntries(
          new Log("doubling", "input=" + input));
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
      this.logservice.saveLogEntries(
          new Log("greeter", "name=" + name));
      return new Person(name, title);

    }
  }

  @GetMapping(value = "appenda/{appendable}")
  public Object getAppendAFunction(@PathVariable String appendable) {
    this.logservice.saveLogEntries(
        new Log("append", appendable + "a"));
    return new WordToAppend(appendable);
  }

  @PostMapping(value = "/dountil/{action}")
  @ResponseBody()
  public Object doUntilFunction(@PathVariable String action, @RequestBody JasonObject jasonObject) {
    this.logservice.saveLogEntries(
        new Log("dountil", "" + action + jasonObject + ""));
    return new PlayWithNums(jasonObject.getUntil(), action);
  }

  @GetMapping(value = "/log")
  public  getLogEntriesFunction() {

  }
}
