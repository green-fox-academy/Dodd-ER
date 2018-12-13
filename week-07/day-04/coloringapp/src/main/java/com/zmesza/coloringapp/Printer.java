package com.zmesza.coloringapp;

import org.springframework.stereotype.Service;

@Service
public class Printer {
  public void log(MyColor color) {
    System.out.println(color.printColor());
  }
}
