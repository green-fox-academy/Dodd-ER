import java.util.Scanner;

public class PrintBigger {
    public static void  main(String[] args){
        // Write a program that asks for two numbers and prints the bigger one
     Scanner sc;
     sc = new Scanner(System.in);

        System.out.println("Give me your first number");
        int firstNum = sc.nextInt();
        System.out.println("Give me your second number");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            System.out.println("Bigger is your first number: " + firstNum);
        } else if (secondNum > firstNum) {
            System.out.println("Bigger is your second number: " + secondNum);
        } else {
            System.out.println(" Your numbers are the same, cheater!");
        }



    }
}
