package com.zmesza.arr_handler.model;

public class InputModel {

  private String what;
  private int[] numbers;

  public InputModel() {
  }

  public InputModel(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
