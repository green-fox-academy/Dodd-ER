package com.zmesza.bankaccount;

public class BankAccount {
  private String name;
  private float balance;
  private String animaltype;

  public BankAccount(String name, float balance, String animaltype) {
    this.name = name;
    this.balance = balance;
    this.animaltype = animaltype;
  }

  public String getName() {
    return this.name;
  }

  public float getBalance() {
    return this.balance;
  }

  public String getAnimaltype() {
    return this.animaltype;
  }
}
