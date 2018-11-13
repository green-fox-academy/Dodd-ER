package counter;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Counter newCounter = new Counter();
        Counter oldCounter = new Counter(76);

        System.out.println("NewCounter field's: " + newCounter.field);
        System.out.println("NewCounter field's after 23 added: " + newCounter.add(23));
        System.out.println("OldCounter field's: " + oldCounter.field);
        System.out.println("OldCounter field's after increased by 1: " + oldCounter.add());
        System.out.println("OldCounter field's after increased by 1: " + oldCounter.add());
        System.out.println("NewCounter's method: " + newCounter.get());
        System.out.println("OldCounter's fields after reset:" + oldCounter.reset());
    }
}
