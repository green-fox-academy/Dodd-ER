import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        Scanner sc ;
        sc = new Scanner(System.in);

        String yourName;

        System.out.println("Hello, World!");
        System.out.println("Hello, You!");
        System.out.println("Can I ask your name?, Please tell me: ");
        yourName = sc.nextLine();
        System.out.println("Hello, " + yourName + ", Welcome!!");


    }
}
