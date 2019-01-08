package com.zmesza.frontend.model;

public class PlayWithNums {

  private int input;
  private int result;

  public PlayWithNums() {
  }

  public PlayWithNums(int input, String action) {
    this.input = input;
    if (action.equals("sum")) {
      int output = 0;
      for (int i = 0; i <= input; i++) {
        output += i;
      }
      this.result = output;
    } else if (action.equals("factor")) {
      int output = 1;
      for (int i = 1; i <= input; i++) {
        output *= i;
      }
      this.result = output;
    }
  }

  public int getInput() {
    return input;
  }

  public void setInput(int input) {
    this.input = input;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
