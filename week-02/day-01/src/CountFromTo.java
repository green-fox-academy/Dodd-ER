import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        Scanner sc;
        sc = new Scanner(System.in);
        int numFirst;
        int numSecond;

        do {
            System.out.println("Please write your first number:");
            numFirst = sc.nextInt();
            System.out.println("Please write your second number:");
            numSecond = sc.nextInt();
            if (numFirst > numSecond){
                System.out.println("The second number should be bigger");
            }
        } while (numFirst > numSecond);

        for (int i = 0; numFirst < numSecond; i++){
            System.out.println(numFirst);
            numFirst++;
        }
    }
}
