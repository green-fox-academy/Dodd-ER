import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int inputNum = sc.nextInt();

        divider(inputNum);
    }

    public static void divider(int inputNum) {
            //int outputNum = 10 / inputNum;
            //return outputNum;
        try {
            System.out.println("10 divided " + inputNum + " is equal to " + 10 / inputNum);
        } catch (Exception e){
            System.out.println("Fail, your exception is: " + e);
        }

    }
}