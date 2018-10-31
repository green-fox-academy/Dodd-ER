import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        String pyramid = "*";


        for (int i = 0; i < num; i++){
            for (int j = 0; j < num - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= i + i; k++){
                System.out.print( "*");
            }
            System.out.println();
        }


    }
}
