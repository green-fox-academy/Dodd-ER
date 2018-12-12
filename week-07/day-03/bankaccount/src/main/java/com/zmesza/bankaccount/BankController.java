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
    accounts.add(new BankAccount("Simba", 2000, "Lion"));
    accounts.add(new BankAccount("Mufasza", 23000, "Lion"));
    accounts.add(new BankAccount("Timon", 300, "Surikata"));
    accounts.add(new BankAccount("Pumba", 200, "Pig"));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String queryAccounts(Model model) {

    model.addAttribute("accounts", accounts);
    return "index";
  }
}
