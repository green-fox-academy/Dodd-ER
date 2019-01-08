package com.zmesza.yondu.model;

public class ErrorMessage {

  private String error;

  public ErrorMessage() {
    this.error = "Provide Distance AND time!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
