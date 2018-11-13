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
    }
}
