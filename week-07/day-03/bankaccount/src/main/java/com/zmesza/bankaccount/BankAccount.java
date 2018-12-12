package com.zmesza.bankaccount;

public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
  private String currency;
  private boolean isKing;
  private String goodOrBad;

  public BankAccount(String name, float balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
    this.isKing = isKing;
    this.goodOrBad = "";
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
    return (isKing) ? "KING, looks shiny :P" : " ";
  }

  public String getGoodOrBad() {
    switch (this.getName()) {
      case "Simba":
        return "Good guy";
      case "Mufasza":
        return "Good guy";
      case "Timon":
        return "Good guy";
      case "Pumba":
        return "Good guy";
      case "Zordon":
        return "Bad guy";
      default:
        return "Neutral guy";
    }
  }
}
