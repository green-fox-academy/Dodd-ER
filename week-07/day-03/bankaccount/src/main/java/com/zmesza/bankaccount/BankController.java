package com.zmesza.bankaccount;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
  public List<BankAccount> accounts = new ArrayList<>();

  public BankController() {
    accounts.add(new BankAccount("Simba", 2000, "Lion", false));
    accounts.add(new BankAccount("Mufasza", 23000, "Lion", true));
    accounts.add(new BankAccount("Timon", 300, "Surikata", false));
    accounts.add(new BankAccount("Pumba", 200, "Pig", false));
    accounts.add(new BankAccount("Zordon", 1200, "Lion", false));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String queryAccounts(Model model) {

    model.addAttribute("accounts", accounts);
    return "index";
  }

  @RequestMapping(path = "/fun", method = RequestMethod.GET)
  public String haveFun(Model model) {
    String funModel = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
     model.addAttribute("funny", funModel);

    return "fun";
  }

//  @RequestMapping(path = "/update", method = RequestMethod.POST)
//  public String haveFun(Model model) {
//    String funModel = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
//    model.addAttribute("funny", funModel);
//
//    return "fun";
//  }
}
