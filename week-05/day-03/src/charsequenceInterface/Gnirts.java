package charsequenceInterface;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

  String stringBackwards;

  public Gnirts(String string) {
    this.stringBackwards = "";
    for (int i = string.length() - 1; i >= 0; i--) {
      this.stringBackwards += string.charAt(i);
    }
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.stringBackwards.charAt(index);
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
