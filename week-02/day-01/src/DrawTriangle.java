import java.util.Scanner;

public class DrawTriangle {
    public static void main (String[] args){
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        String star = "*";
        String starInc = "*";

        for (int i = 1; i <= num; i++){
            System.out.println(star);
            star = star + starInc;
        }

    }
}
