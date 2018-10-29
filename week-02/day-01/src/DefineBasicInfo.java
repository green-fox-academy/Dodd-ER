import java.util.Scanner;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        Scanner scan;
        scan = new Scanner(System.in);

        String yourName;
        int yourAge;
        double yourHeight;


        System.out.println("Please tell me your name:");
        yourName = scan.nextLine();
        System.out.println("Please tel me your age:");
        yourAge = scan.nextInt();
        System.out.println("Last bat not least. Tell me your Height");
        yourHeight = scan.nextDouble();
        System.out.println("So You are " + yourName + ", " + yourAge + " years old, and your height is " + yourHeight + ".");

    }
}
