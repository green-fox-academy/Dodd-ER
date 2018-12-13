package com.zmesza.coloringapp;

public class WhiteColor implements MyColor{
  private String nameOfColor;

  public WhiteColor() {
    this.nameOfColor = "White";
  }

  @Override
  public String printColor() {
    return this.nameOfColor;
  }
}
