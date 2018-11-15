public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    System.out.println(sumDigit(126));
  }

  public static int sumDigit(int num) {
    if (num > 0) {
      return num % 10 + sumDigit(num / 10);
    }
    return 0;
  }

}
