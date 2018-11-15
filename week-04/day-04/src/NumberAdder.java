public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    numberAdder(5);
  }

  public static void numberAdder ( int num) {
    int i = 0;
    System.out.println(numberAdder2(num, i + 1));
  }

  public static int numberAdder2 (int num, int counter) {
    if (num > counter) {
      numberAdder(num + (num - 1));
    }
    return num;
  }
}
// 1 -> 1
// 2 -> 3
// 3 -> 6
// 4 -> 10
// 5 -> 15
//
//
