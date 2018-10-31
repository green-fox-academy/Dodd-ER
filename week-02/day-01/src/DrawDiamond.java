import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i < num / 2) {
                for (int j = 0; j < (num / 2) - i; j++) {
                    System.out.print("-");
                }
                for (int k = 0; k <= i + i; k++) {
                    System.out.print("*");
                }
            }else if (i > num / 2) {
                for (int j = 0; j < i - (num / 2); j++) {
                    System.out.print("-");
                }
                for (int k = 0; k < (num - i) + ((num - i) / 2); k++) {
                    System.out.print("*");

                    //7num 4i 5*
                    //7num 5i 3*
                    //7num 6i 1*
                }
            } else if (i == num / 2) {
                for (int k = 0; k < num; k++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }


    }
}
