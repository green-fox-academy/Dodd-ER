import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        double myWidth;
        double myDepth;
        double myHeight;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please give me your cube Width in cm: ");
        myWidth = sc.nextDouble();
        System.out.println("Please give me your cube Depth in cm: ");
        myDepth = sc.nextDouble();
        System.out.println("Please give me your cube Height in cm: ");
        myHeight = sc.nextDouble();

        double mySurface = (((myWidth * myHeight) + (myDepth * myHeight) + (myDepth * myWidth)) * 2);
        double myVolume = (myWidth * myHeight * myDepth);

        System.out.println("Your cube's Surface is " + mySurface + " cm2");
        System.out.println("Your cube's Volume is " + myVolume + " cm3");

    }
}
