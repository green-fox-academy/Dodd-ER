package pirates;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parrot {
  String name;
  Color color;
  int numsOfLegs;

  public Parrot(){
    this.name = "Jack Nicholson";
    this.color = new Color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255));
    this.numsOfLegs = (int)Math.random() * 2;
  }
}
