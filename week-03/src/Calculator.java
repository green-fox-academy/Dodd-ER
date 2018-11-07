import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
        List<String> inputMath;

        System.out.println("Please enter an operation and two operand!");
        String userInput = sc.nextLine();
        inputMath= Arrays.asList(userInput.split(" "));
        System.out.println(calculator(inputMath));
    }

    public static int calculator(List<String> inputList){
        int outputNum = 0;
        String inputString = inputList.get(0);
        int inputNum1 = Integer.parseInt(inputList.get(1));
        int inputNum2 = Integer.parseInt(inputList.get(2));


        switch (inputString) {
            case "+":
                outputNum = inputNum1 + inputNum2;
                break;
            case "-":
                outputNum = inputNum1 - inputNum2;
                break;
            case "*":
                outputNum = inputNum1 * inputNum2;
                break;
            case "/":
                outputNum = inputNum1 / inputNum2;
                break;
            case "%":
                outputNum = inputNum1 % inputNum2;
                break;
            default:
                System.out.println("Wrong input type");
                break;


        }
        return outputNum;
    }
}
