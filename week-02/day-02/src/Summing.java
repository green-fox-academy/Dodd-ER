import java.util.Scanner;

public class Summing {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer

    public static int sum(int num1, int num2){
        int numSum = num1 + num2;
        return numSum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your first number");
        int num1 = sc.nextInt();
        System.out.println("Write your second number");
        int num2 = sc.nextInt();

        System.out.println("Two number sum: " + sum(num1, num2));
    }
}
