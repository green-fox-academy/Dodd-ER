package com.zmesza.foxclub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping("/info")
  public String index() {
    return "information";
  }

  @RequestMapping("/login")
  public String loginGet() {
    return "login";
  }

  @PostMapping()
  public String loginPost() {
    return "information";
  }
}
