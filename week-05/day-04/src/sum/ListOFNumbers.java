package sum;

import java.util.ArrayList;
import java.util.List;

public class ListOFNumbers {
  List<Integer> nums;

  public ListOFNumbers() {
    this.nums = new ArrayList<>();
    nums.add(null);
  }

  public ListOFNumbers(int numberOfElements) {
    this.nums = new ArrayList<>();

    for (int i = 0; i <= numberOfElements; i++) {
      nums.add(i);
    }
  }

  public Object sum() {
    int sumOfNums = 0;
    if (this.nums.get(0) == null) {
      return null;
    } else
    for (int elements : this.nums) {
      sumOfNums += elements;
    }
    return sumOfNums;
  }
}
