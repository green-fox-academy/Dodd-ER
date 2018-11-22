package playwithanagram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  String word1;
  String word2;

  public Anagram(String word1, String word2) {
    this.word1 = word1;
    this.word2 = word2;
  }

  public boolean isAnagram() {
    char temp1[] = this.word1.toLowerCase().toCharArray();
    char temp2[] = this.word2.toLowerCase().toCharArray();

    Arrays.sort(temp1);
    Arrays.sort(temp2);

    if (temp1.length != temp2.length) {
      for (int i = 0; i < temp1.length; i++) {
        if (temp1[i] != temp2[i]) {
          return false;
        }
      }
    }
        return true;
  }
}
