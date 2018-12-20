package com.zmesza.reddit.controller;

import com.zmesza.reddit.model.Post;
import com.zmesza.reddit.model.User;
import com.zmesza.reddit.service.PostService;
import com.zmesza.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  private UserService userService;
  private PostService postService;

  @Autowired
  public PostController(UserService userService, PostService postService) {
    this.userService = userService;
    this.postService = postService;
  }

  @GetMapping(value = "/login")
  public String getLoginPage(Model model) {
    model.addAttribute("user", new User());
    return "login";
  }

  @PostMapping(value = "/login")
  public String sendLoginPage(@ModelAttribute User user) {
    this.userService.saveNewUser(user);
    return "redirect:/index";
  }

  @GetMapping(value = "/index")
  public String getIndexPage(Model model) {
    model.addAttribute("listOfPosts", this.postService.getAllPost());
    return "index";
  }

  @GetMapping(value = "/add")
  public String getItemPage(Model model) {
    model.addAttribute("post", new Post());
    return "add";
  }

  @PostMapping(value = "/add")
  public String getItem(@ModelAttribute Post post) {
    this.postService.saveNewPost(post);
    return "redirect:/index";
  }
}
