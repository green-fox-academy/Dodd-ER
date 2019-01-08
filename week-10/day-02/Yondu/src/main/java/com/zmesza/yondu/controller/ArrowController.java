package com.zmesza.yondu.controller;

import com.zmesza.yondu.model.Arrow;
import com.zmesza.yondu.model.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrowController {

  @GetMapping(value = "/yondu")
  public ResponseEntity<Object> getSpeedFunction(@RequestParam(value = "distance", required = false) Double distance,
                                                @RequestParam(value = "time", required = false) Double time) {
    if (distance == null || time == null) {
      return new ResponseEntity<>(
          new ErrorMessage(),
          HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity<>(
          new Arrow(distance, time),
          HttpStatus.OK);
    }
  }

}
