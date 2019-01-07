package com.zmesza.frontend.model;

public class Person {

  private String name;
  private String title;
  private String welcome_message;

  public Person() {
  }

  public Person(String name, String title) {
    this.name = name;
    this.title = title;
    this.welcome_message = "Oh, hi there " + this.name + ", my dear " + this.title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
