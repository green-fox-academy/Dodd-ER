package apple;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class AppleTest {

  @Test
  public void testgetApple() {
    Apple apple = new Apple();
    assertEquals("apple", apple.getApple());
  }
}
