package com.zmesza.frontend.model;

public class DoublingMessage {

  private String error;

  public DoublingMessage() {
    this.error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
