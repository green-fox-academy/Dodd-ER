package com.zmesza.coloringapp;

public class GreenColor implements MyColor{
  private String nameOfColor;

  public GreenColor() {
    this.nameOfColor = "Green";
  }

  @Override
  public String printColor() {
    return this.nameOfColor;
  }
}
