import java.util.Scanner;


public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("How many chickens has a farmer in his farm?");
        int chikens = sc.nextInt();
        System.out.println("How many pigs has a farmer in his farm?");
        int pigs = sc.nextInt();
        System.out.println("In the farm you can count " + ((chikens * 2) + (pigs * 4 )) + " legs all.");
    }
}
