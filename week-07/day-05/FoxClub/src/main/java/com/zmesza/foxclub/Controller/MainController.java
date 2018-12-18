package com.zmesza.foxclub.Controller;

import com.zmesza.foxclub.Service.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private Fox myFox;

  @Autowired
  public MainController(Fox myFox) {
    this.myFox = myFox;
  }

  @GetMapping("/info")
  public String index(Model model) {
    model.addAttribute("name", myFox.getName());
    model.addAttribute("food", myFox.getFood());
    model.addAttribute("drink", myFox.getDrink());
    model.addAttribute("tricks", myFox.getListOfTricks());
    return "information";
  }

  @GetMapping("/login")
  public String loginGet() {
    return "login";
  }

  @GetMapping("nutrition")
  public String NutritionSet() {
    return "information";
  }

  @GetMapping("tricks")
  public String AddTrick() {
    return "information";
  }

  @PostMapping("/info")
  public String loginPost(@RequestParam String nameInput, Model model) {
    myFox.setName(nameInput);
    model.addAttribute("name", myFox.getName());
    model.addAttribute("food", myFox.getFood());
    model.addAttribute("drink", myFox.getDrink());
    model.addAttribute("tricks", myFox.getListOfTricks());
    return "information";
  }
}
