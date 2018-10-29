import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Write a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

    }
}
