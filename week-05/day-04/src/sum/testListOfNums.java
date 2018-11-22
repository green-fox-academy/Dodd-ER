package sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testListOfNums {

  @Test ()
  public void testSum1() {
    ListOFNumbers newNums = new ListOFNumbers();
    assertEquals(null, newNums.sum());
  }

  @Test
  public void testSum2() {
    ListOFNumbers newNums = new ListOFNumbers(0);
    assertEquals(0, newNums.sum());
  }

  @Test
  public void testSum3() {
    ListOFNumbers newNums = new ListOFNumbers(1);
    assertEquals(1, newNums.sum());
  }

  @Test
  public void testSum4() {
    ListOFNumbers newNums = new ListOFNumbers(3);
    assertEquals(6, newNums.sum());
  }
}
