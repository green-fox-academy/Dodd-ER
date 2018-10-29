public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int c = 0;

        System.out.println("a is: " + a);
        System.out.println("b is: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("a is now: " + a);
        System.out.println("b is now : " + b);


    }
}
