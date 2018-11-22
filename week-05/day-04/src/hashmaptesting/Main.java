package hashmaptesting;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
  String word;

  public Main(String word) {
    this.word = word;
  }

  public int countOccurrences(char c) {
    int num = 0;
    for (int i = 0; i < this.word.length(); i++) {
      if (c == this.word.charAt(i)) {
        num++;
      }
    }
    return num;
  }

  public HashMap<Character, Integer> getHashmap() {
    HashMap<Character, Integer> newHashmap = new HashMap<>();
    for (int i = 0; i < this.word.length(); i++) {
      newHashmap.put(this.word.charAt(i), countOccurrences(this.word.charAt(i)));
    }
    return newHashmap;
  }
}
