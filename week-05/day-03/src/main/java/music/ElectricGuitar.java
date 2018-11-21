package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int num) {
    this.name = "Electric Guitar";
    this.numberOfStrings = num;
  }

  public String sound() {
    return "Twang";
  }

  public void play() {
    System.out.println(this.name + " plays with " + this.numberOfStrings + " string, and it sounds: " + this.sound());
  }
}
