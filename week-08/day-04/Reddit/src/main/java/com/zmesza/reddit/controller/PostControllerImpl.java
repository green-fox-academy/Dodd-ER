package com.zmesza.reddit.controller;

import com.zmesza.reddit.model.User;
import com.zmesza.reddit.service.PostServiceImpl;
import com.zmesza.reddit.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  private UserServiceImpl userService;
  private PostServiceImpl postService;

  @Autowired
  public PostController(UserServiceImpl userService, PostServiceImpl postService) {
    this.userService = userService;
    this.postService = postService;
  }

  @GetMapping(value = "/login")
  public String getLoginPage(Model model) {
    model.addAttribute("user", new User());
    return "login";
  }

  @PostMapping(value = )
  public sendLoginPage() {

  }
}
