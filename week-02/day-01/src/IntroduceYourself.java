import java.util.Scanner;

public class IntroduceYourself {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        Scanner sc;
        sc = new Scanner(System.in);

        String yourName = "";
        int yourAge = 1;
        double yourWeight = 0.1;


        System.out.println("Please tell me your name:");
        yourName = sc.nextLine();
        System.out.println("Please tel me your age:");
        yourAge = sc.nextInt();
        System.out.println("Last bat not least. Tell me your weight");
        yourWeight = sc.nextDouble();
        System.out.println("So You are " + yourName + ", " + yourAge + " years old, and your weight is " + yourWeight + ".");
    }
}
