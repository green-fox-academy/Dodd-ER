public class Reverse {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};

        //   for (int i = 4; i >= 0; i--){
        //        System.out.print("|" + aj[i] + "|");

        for (int i = 1; i < ((aj.length / 2) + 1); i++) {
            int joker = aj[i - 1];
            aj[i - 1] = aj[aj.length - i];
            aj[aj.length - i] = joker;

        }
        for (int elements : aj) {
            System.out.print(elements);
        }
    }
}
