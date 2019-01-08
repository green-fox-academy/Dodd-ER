package com.zmesza.arr_handler.model;

public class TransferClass {

  private Object result;

  public TransferClass(String action, int[] nums) {

    if (action.equals("sum")) {
      int sumResult = 0;

      for (int element : nums) {
        sumResult += element;
      }
      this.result = sumResult;
    } else if (action.equals("multiply")) {
      int multiplyResult = 1;

      for (int element : nums) {
        multiplyResult *= element;
      }
      this.result = multiplyResult;
    } else if (action.equals("double")) {
      int[] doubleResult = new int[nums.length];

      for (int i = 0; i < nums.length; i++) {
        doubleResult[i] = nums[i] * 2;
      }
      this.result = doubleResult;
    }
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }
}
