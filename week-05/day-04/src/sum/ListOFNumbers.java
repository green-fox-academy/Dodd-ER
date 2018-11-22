package sum;

import java.util.ArrayList;
import java.util.List;

public class ListOFNumbers {
  List<Integer> nums;

  public ListOFNumbers() {
    this.nums = new ArrayList<>();
  }

  public ListOFNumbers(int numberOfElements) {
    this.nums = new ArrayList<>();

    for (int i = 1; i <= numberOfElements; i++) {
      nums.add(i);
    }
  }

  public int sum() {
    int sumOfNums = 0;
    for (int elements : this.nums) {
      sumOfNums += elements;
    }
    return sumOfNums;
  }
}
