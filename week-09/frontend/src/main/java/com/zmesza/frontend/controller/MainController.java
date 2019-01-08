package com.zmesza.frontend.controller;

import com.zmesza.frontend.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private LogService logservice;

  @Autowired
  public MainController(LogService logservice) {
    this.logservice = logservice;
  }

  @GetMapping (value = "/")
  public String getIndexPage() {
    return "index";
  }

}
