import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner sc;
        sc = new Scanner(System.in);


        System.out.println("Your first number: ");
        double firstNumber = sc.nextDouble();
        System.out.println("Your second number: ");
        double secNumber = sc.nextDouble();
        System.out.println("Your third number: ");
        double thirdNumber = sc.nextDouble();
        System.out.println("Your fourth number: ");
        double fourthNumber = sc.nextDouble();
        System.out.println("Your fifth number: ");
        double fifthNumber = sc.nextDouble();

        System.out.println("Sum of your numbers is: " + (firstNumber + secNumber + thirdNumber + fourthNumber + fifthNumber));
        System.out.println("Average of your numbers is: " + ((firstNumber + secNumber + thirdNumber + fourthNumber + fifthNumber) / 5));

    }
}
