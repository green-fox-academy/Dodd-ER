package com.zmesza.frontend.model;

public class GreetingMessage {

  private String error;

  public GreetingMessage(String name, String title) {

    if (name == null && title == null) {
      this.error = "Please provide a name and a title!";
    } else if (name == null) {
      this.error = "Please provide a name!";
    } else if (title == null) {
      this.error = "Please provide a title!";
    }
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
