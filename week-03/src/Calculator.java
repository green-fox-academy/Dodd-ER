import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner sc = new Scanner(System.in);
        List<Object> inputMath;

        System.out.println("Please enter an operation and two operand!");
        String userInput = sc.next();
        inputMath= Arrays.asList(userInput.split(" "));
        System.out.println(calculator(inputMath));
    }

    public static int calculator(List<Object> inputList){
        Integer outputNum = 0;
        char inputChar = (char) inputList.indexOf(0);
        int inputNum1 = inputList.indexOf(1);
        int inputNum2 = inputList.indexOf(2);


        switch (inputChar) {
            case '+':
                outputNum = inputNum1 + inputNum2;
                break;
            case '-':
                outputNum = inputNum1 - inputNum2;
                break;
            case '*':
                outputNum = inputNum1 * inputNum2;
                break;
            case '/':
                outputNum = inputNum1 / inputNum2;
                break;
            case '%':
                outputNum = inputNum1 % inputNum2;
                break;
            default:
                System.out.println("Wrong input type");
                break;


        }
        return outputNum;
    }
}
