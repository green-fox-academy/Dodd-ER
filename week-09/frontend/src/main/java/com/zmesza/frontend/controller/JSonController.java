package com.zmesza.frontend.controller;

import com.zmesza.frontend.model.InputNumber;
import com.zmesza.frontend.model.Message;
import com.zmesza.frontend.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
      return new Message();
    }
  }
}
