import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("It's a guessing game. Please enter a number, ");
        System.out.println("I'm gonna make a random number from zero to your's.");
        System.out.println("Your number is:");
        int inputNum = sc.nextInt();
        int randomNum = (int)(Math.random() * inputNum);
        int lives = 10;
        System.out.println("Let's play, You have 10 lives to find my random number!");
        while (lives > 0){
            System.out.println("Guess!");
            int guess = sc.nextInt();

            if (guess != randomNum) {
                System.out.println("Wrong number!");
                if (guess < randomNum) {
                    System.out.println("Try higher");
                } else {
                    System.out.println("Try lower");
                }
                lives--;
            }else {
                System.out.println("Right! Amazing job!!");
                break;
            }
        }
    }
}
