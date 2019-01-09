package com.zmesza.p2p_project.controller;

import com.zmesza.p2p_project.model.Log;
import com.zmesza.p2p_project.model.Message;
import com.zmesza.p2p_project.service.MessageService;
import org.hibernate.query.criteria.internal.expression.function.CurrentTimestampFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sun.util.calendar.LocalGregorianCalendar;

import java.sql.Timestamp;
import java.util.Date;

@Controller
public class MainController {

  private MessageService messageService;

  @Autowired
  public MainController(MessageService messageService) {
    this.messageService = messageService;
  }

  @GetMapping(value = "/register")
  public String getRegisterPage(Model model) {
    if (this.messageService.isThereAtLeastOneUser()){
      System.out.println(new Log("/register", "GET","INFO", "there is one in db").getCoreMessage());
      return "redirect:/";
    } else {
      model.addAttribute("model", new Message());
      System.out.println(new Log("/register", "GET","INFO", "there is noone in db").getCoreMessage());
      return "register";
    }
  }

  @PostMapping(value = "/register")
  public String infoFromRegisterPage(Message message) {
    System.out.println(new Log("/register", "Post","INFO", "after posting").getCoreMessage());
    this.messageService.saveNewMessage(message);
    return "redirect:/";
  }

  @GetMapping("/")
  public String getMainPage(Message message, Model model) {
    if (!this.messageService.isThereAtLeastOneUser()) {
      System.out.println(new Log("/", "GET","INFO", "there is noone in db").getCoreMessage());
      return "redirect:/register";
    } else {
      System.out.println(new Log("/", "GET","INFO", "there is one in db").getCoreMessage());
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
}
