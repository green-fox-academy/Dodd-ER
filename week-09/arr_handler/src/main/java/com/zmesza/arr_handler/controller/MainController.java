package com.zmesza.arr_handler.controller;

import com.zmesza.arr_handler.model.ErrorMessage;
import com.zmesza.arr_handler.model.InputModel;
import com.zmesza.arr_handler.model.TransferClass;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @PostMapping(value = "/arrays")
  public Object arrayHandlerFunction(@RequestBody InputModel inputModel) {
    if (inputModel.getWhat() == null || inputModel.getNumbers() == null) {
      return new ErrorMessage();
    } else {
      return new TransferClass(inputModel.getWhat(), inputModel.getNumbers());
    }
  }
}
