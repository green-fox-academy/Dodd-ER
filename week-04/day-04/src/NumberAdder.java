public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    System.out.println(numberAdder(5));
  }

  public static int numberAdder(int num) {
    if (num > 0) {
      return numberAdder((num - 1)) + num;
    }
    return 0;
  }
}
// 1 -> 1
// 2 -> 3
// 3 -> 6
// 4 -> 10
// 5 -> 15
//
//
