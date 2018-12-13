package com.zmesza.coloringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringappApplication implements CommandLineRunner {

  @Autowired
  public ColoringappApplication(MyColor color) {
    color.printColor();
  }

  public static void main(String[] args) {
    SpringApplication.run(ColoringappApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    new ColoringappApplication(new RedColor());
  }
}

