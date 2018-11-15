public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    System.out.println(bunniesEarsAgain(8));
  }

  public static int bunniesEarsAgain(int num) {
    if (num > 0) {
      if (num % 2 == 1) {
        return 2 + bunniesEarsAgain(num - 1);
      } else if (num % 2 == 0) {
        return 3 + bunniesEarsAgain(num - 1);
      }
    }
    return 0;
  }
}
// 1 -> 3
// 2 -> 5
// 3 -> 7
// 4 -> 10
// 5 -> 12
// 6 -> 15
// 7 -> 17
// 8 -> 20
