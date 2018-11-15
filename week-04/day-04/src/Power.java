public class Power {
  public  static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    System.out.println(power(3, 2));
  }

  private static int power(int power, int num) {
    if (num >= 1) {
      return power * power(power, num - 1);
    }
    return 1;
  }
}

