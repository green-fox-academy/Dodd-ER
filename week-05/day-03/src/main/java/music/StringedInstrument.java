package main.java.music;

abstract public class StringedInstrument extends Instrument{
  protected int numberOfStrings;


  protected StringedInstrument() {
    this.numberOfStrings = 0;
  }

  abstract public String sound();

  public void play() {
    System.out.println(this.name + " plays with " + this.numberOfStrings);
  }
}
