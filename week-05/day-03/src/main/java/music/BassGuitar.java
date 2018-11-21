package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int num) {
    this.name = "Bass Guitar";
    this.numberOfStrings = num;
  }

  public String sound() {
    return "Duum-duum-duum";
  }

  public void play() {
    System.out.println(this.name + " plays with " + this.numberOfStrings + " string, and it sounds: " + this.sound());
  }
}
