package com.zmesza.p2p_project.controller;

import com.zmesza.p2p_project.model.Log;
import com.zmesza.p2p_project.model.Message;
import com.zmesza.p2p_project.model.ReceivedMessage;
import com.zmesza.p2p_project.model.User;
import com.zmesza.p2p_project.model.status_message.StatusMessage;
import com.zmesza.p2p_project.service.MessageService;
import com.zmesza.p2p_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private MessageService messageService;
  private UserService userService;

  @Autowired
  public MainController(MessageService messageService, UserService userService) {
    this.messageService = messageService;
    this.userService = userService;
  }

  @GetMapping(value = "/register")
  public String getRegisterPage(Model model) {
    if (this.userService.isThereAtLeastOneUser()){
      return "redirect:/";
    } else {
      model.addAttribute("model", new User());
      return "register";
    }
  }

  @PostMapping(value = "/register")
  public String infoFromRegisterPage(User user) {
    System.out.println(new Log("/register", "Post","INFO", "after posting").getCoreMessage());
    this.userService.saveUser(user);
    return "redirect:/";
  }

  @GetMapping("/")
  public String getMainPage(Message message, Model model) {
    if (!this.userService.isThereAtLeastOneUser()) {
      System.out.println(new Log("/", "GET","INFO", "there is noone in db").getCoreMessage());
      return "redirect:/register";
    } else {
      System.out.println(new Log("/", "GET","INFO", "there is one in db").getCoreMessage());
      model.addAttribute("user", this.userService.getUser());
      model.addAttribute("list_of_messages", this.messageService.getAllMessage());
      model.addAttribute("model", message);
      return "main";
    }
  }

  @PostMapping("/")
  public String reloadMainPage(Message message) {
    System.out.println(new Log("/", "Post","INFO", "after posting new message").getCoreMessage());
    this.messageService.saveNewMessage(message);
    return "redirect:/";
  }

  @PostMapping("/update_user")
  public String updateUserName(User user) {
    this.userService.saveUser(user);
    return "redirect:/";
  }

  @PostMapping("/new_message")
  public String sendNewMessage(Message message) {
    message.setUserName(this.userService.getUser().getName());
    this.messageService.saveNewMessage(message);
    return "redirect:/";
  }

  @PostMapping("/api/message/receive")
  @ResponseBody
  public ResponseEntity<StatusMessage> apiMessageReceiver(@RequestBody ReceivedMessage receivedMessage) {
    receivedMessage.getMessage().setUserName(receivedMessage.getClient().getId());
    this.messageService.saveNewMessage(receivedMessage.getMessage());
    return new ResponseEntity<>(this.messageService.getStatusMessage(receivedMessage), HttpStatus.OK);
  }
}
