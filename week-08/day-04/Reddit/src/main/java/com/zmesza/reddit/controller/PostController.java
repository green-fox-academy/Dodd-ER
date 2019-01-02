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

  @GetMapping(value = "/{id}/add")
  public String getItemPage(@PathVariable int id,Model model) {
    model.addAttribute("post", new Post());
    model.addAttribute("user", this.userService.getUserById(id));
    return "add";
  }

  @PostMapping(value = "/{id}/add")
  public String getItem(@PathVariable int id, @ModelAttribute Post post) {
    this.postService.saveNewPost(post);
    return "redirect:/index";
  }

  @PostMapping(value="/{id}/voteup")
  public String sendVoteUp(@PathVariable int id) {
    this.postService.voteUpById(id);
    return "redirect:/index";
  }

  @PostMapping(value = "/{id}/votedown")
  public String sendVoteDown(@PathVariable int id) {
    this.postService.voteDownById(id);
    return "redirect:/index";
  }

  @PostMapping(value = "/{id}/delete")
  public String deleteItem(@PathVariable int id) {
    this.postService.deletePostById(id);
    return "redirect:/index";
  }

}
