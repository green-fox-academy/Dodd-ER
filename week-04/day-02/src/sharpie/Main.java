package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie itemFirst = new Sharpie("Blue", (float) 1.5);
        Sharpie itemSecond = new Sharpie("Red", (float) 2.5);

        for (int i = 0; i < 34; i++) {
            itemFirst.use();
        }
        System.out.println("First Sharpie's ink amount after massive use: " + itemFirst.inkAmount);
        System.out.println("Second Sharpie's ink amount (New sharpie): " + itemSecond.inkAmount);

        SharpieSet firstSet = new SharpieSet();

        for (int i = 0; i < 100; i++) {
            firstSet.listOfSharpie.get(1).use();
        }

        System.out.println("How many useble sharpie in a set: " + firstSet.countUsable());
        System.out.println("How many sharpie in a set: " + firstSet.listOfSharpie.size());
        firstSet.removeTrash();
        System.out.println("How many sharpie in a set after remove the empties: " + firstSet.listOfSharpie.size());
    }
}
