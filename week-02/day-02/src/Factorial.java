import java.util.Scanner;

public class Factorial {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static int factorio(int num){
        int fakt = 1;
        for (int i = 1; i <= num; i++){
            fakt *= i;
        }
        return fakt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please write a number: ");
        int number = sc.nextInt();
        System.out.println("Your number's factorio is: " + factorio(number));


    }

}
