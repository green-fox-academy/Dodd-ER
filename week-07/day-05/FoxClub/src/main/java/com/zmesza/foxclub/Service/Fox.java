package com.zmesza.foxclub.Service;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class Fox {
  private int id;
  private String name;
  private String food;
  private String drink;
  private List<String> listOfTricks;

  public Fox() {
    this.id = 1;
    this.name = "Mr.Fox";
    this.food = "Pasta";
    this.drink = "Tonic";
    this.listOfTricks = Arrays.asList("Write HTML","Code in Java","Dumb in CSS");
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }
}
