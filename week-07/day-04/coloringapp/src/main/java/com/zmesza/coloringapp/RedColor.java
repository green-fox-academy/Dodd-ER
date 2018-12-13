package com.zmesza.coloringapp;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
  private String nameOfColor;

  public RedColor() {
    this.nameOfColor = "Red";
  }

  @Override
  public String printColor() {
    return this.nameOfColor;
  }
}
