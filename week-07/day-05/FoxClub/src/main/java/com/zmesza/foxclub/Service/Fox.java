package com.zmesza.foxclub.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Fox {
  private int id;
  private String name;
  private String food;
  private String drink;
  private List<String> listOfTricks;

  public Fox(String name) {
    this.id = 1;
    this.name = name;
    this.food = "Pasta";
    this.drink = "Tonic";
    this.listOfTricks = Arrays.asList("Write HTML","Code in Java","Dumb in CSS");
  }

}
