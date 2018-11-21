package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
  }

  public Violin(int num) {
    this.name = "Violin";
    this.numberOfStrings = num;
  }

  public String sound() {
    return "Screech";
  }

  public void play() {
    System.out.println(this.name + " plays with " + this.numberOfStrings + " string, and it sounds: " + this.sound());
  }
}
