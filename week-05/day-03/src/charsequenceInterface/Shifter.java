package charsequenceInterface;

import java.util.stream.IntStream;

public class Shifter implements CharSequence{
 String string;
 int num;

 public Shifter(String string, int num) {
   this.string = string;
   this.num = num;
 }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index + num);
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
