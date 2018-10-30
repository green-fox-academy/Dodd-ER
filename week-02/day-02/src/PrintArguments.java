import java.util.Scanner;

public class PrintArguments {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourth")
    // ...

    //private static int largest(int... numbers) {
    //  int currentLargest = numbers[0];
    //    for (int number : numbers) {
    //        if (number > currentLargest) {
    //            currentLargest = number;
    //        }
    //    }
    //    return currentLargest;
    //}

    public static String printParams(String... sentence){
        return sentence[0] + sentence[1];
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a sentence");
        String mySentence = sc.nextLine();
        printParams(mySentence);
    }
}
