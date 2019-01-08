package com.zmesza.arr_handler.model;

public class ErrorMessage {

  private String error;

  public ErrorMessage() {
    this.error = "Please provide what to do with the numbers!";
  }

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
