package com.zmesza.frontend.controller;

import com.zmesza.frontend.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private MainService service;

  @Autowired
  public MainController(MainService service) {
    this.service = service;
  }

  @GetMapping (value = "/")
  public String getIndexPage() {
    return "index";
  }

}
