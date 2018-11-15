public class Counter {
  public static void main(String[] args) {
    counter(10);
  }

  public static void counter(int num) {
    if (num > 0) {
      System.out.println(num);
      counter(num - 1);
    }
  }
}
