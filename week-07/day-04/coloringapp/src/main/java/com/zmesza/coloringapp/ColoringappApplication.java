package com.zmesza.coloringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringappApplication implements CommandLineRunner {

  Printer prntr;

  @Autowired
  public ColoringappApplication(MyColor color, Printer prntr) {
    this.prntr = prntr;
    prntr.log(color);
  }

  public static void main(String[] args) {
    SpringApplication.run(ColoringappApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    new ColoringappApplication(new WhiteColor(), new Printer());
  }
}

