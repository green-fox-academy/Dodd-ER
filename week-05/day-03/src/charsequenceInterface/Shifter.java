package charsequenceInterface;

import java.util.stream.IntStream;

public class Shifter implements CharSequence{
 String string;

 public Shifter(String string, int num) {
   this.string = "";
   for (int i = num; i <string.length(); i++) {
     this.string += string.charAt(i);
   }
 }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}
