public class Factorio {
  public static void main(String[] args) {

    System.out.println(factorio(4));
  }

  public static int factorio(int num) {
    if (num == 1) {
      return 1;
    }
    return num * factorio(num - 1);
  }
}
