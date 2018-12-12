package com.zmesza.bankaccount;

public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
  private String currency;
  private boolean isKing;

  public BankAccount(String name, float balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
    this.isKing = isKing;
  }

  public String getName() {
    return this.name;
  }

  public float getBalance() {
    return this.balance;
  }

  public String getAnimalType() {
    return this.animalType;
  }

  public String getCurrency() {
    return this.currency;
  }

  public String getIsKing() {
    return (isKing)? "KING look shiny :P" : " ";
  }
}
