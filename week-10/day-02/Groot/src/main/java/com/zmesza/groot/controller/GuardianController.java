package com.zmesza.groot.controller;

import com.zmesza.groot.model.ErrorMessage;
import com.zmesza.groot.model.Groot;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping(value = "/groot")
  public ResponseEntity<Object> getTranslateFromGroot(@RequestParam(value = "message", required = false) String message) {
    if (message.isEmpty()) {
      return new ResponseEntity<>(
          new ErrorMessage(),
          HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>(
          new Groot(message),
          HttpStatus.OK);
    }
  }
}
