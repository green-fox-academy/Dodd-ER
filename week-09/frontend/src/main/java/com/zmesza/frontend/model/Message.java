package com.zmesza.frontend.model;

public class Message {

  private String error;

  public Message() {
    this.error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
