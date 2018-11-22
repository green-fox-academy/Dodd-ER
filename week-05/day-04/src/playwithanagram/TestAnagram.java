package playwithanagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestAnagram {

  @Test
  public void isAnagramTest1() {
    Anagram forTest = new Anagram("something", "gnihtemos");
    assertEquals(true, forTest.isAnagram());
  }

  @Test
  public void isAnagramTest2() {
    Anagram forTest = new Anagram("something", "somethingelse");
    assertEquals(false, forTest.isAnagram());
  }
}
