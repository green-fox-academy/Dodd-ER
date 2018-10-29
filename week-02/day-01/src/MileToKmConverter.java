import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner sc;
        sc = new Scanner(System.in);
        double travelInKm;
        double travelInMiles;

        System.out.println("Share how much you travel today in Km?");
        travelInKm = sc.nextDouble();
        travelInMiles = travelInKm * 0.621371192;
        System.out.println("It is exactly " + travelInMiles +" in Miles.");



    }
}
