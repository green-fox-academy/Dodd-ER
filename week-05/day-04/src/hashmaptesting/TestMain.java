package hashmaptesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMain {

  @Test
  public void getHashMapTest1() {
    Main forTest = new Main("error");
    assertEquals(3, (int)forTest.getHashmap().get('r'));
  }
}
