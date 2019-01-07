package com.zmesza.teveclub.controller;

import com.zmesza.teveclub.model.User;
import com.zmesza.teveclub.service.CamelService;
import com.zmesza.teveclub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  UserService userService;
  CamelService camelService;

  @Autowired
  public MainController(UserService userService, CamelService camelService) {
    this.userService = userService;
    this.camelService = camelService;
  }

  @GetMapping(value = "/camels")
  public String getCamelsPage(Model model) {
    model.addAttribute("listOfCamels", this.camelService.getAllCamel());
    return "camels";
  }

  @GetMapping(value="/{id}/mycamels")
  public String getMyCamels(@PathVariable long id, Model model) {
    model.addAttribute("listOfCamels", this.camelService.getAllCamelsByUserId(id));
    return "mycamels";
  }

  @GetMapping(value = "/users")
  public String getUsersPage(Model model) {
    model.addAttribute("listOfUsers", this.userService.getAllUser());
    return "users";
  }

  @GetMapping(value = "user/login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping(value = "/user/login")
  public String login(String name, String password, Model model) {
    model.addAttribute("message", this.userService.errorMessage());
    return this.userService.login(name, password);
  }

  @GetMapping(value = "/user/registration")
  public String getRegPage(Model model) {
    model.addAttribute("user", new User());
    return "registration";
  }

  @PostMapping(value = "/user/registration")
  public String registration(@ModelAttribute User user) {
    this.userService.saveUser(user);
    return this.camelService.getStringToCamelsByUserId(user.getId());
  }
}
