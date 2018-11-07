import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MatRev {

    public static  void main(String[] args){
        ArrayList<String> myFirstListInJava = new ArrayList<>();
        myFirstListInJava.add("Hello TipTop!");
        myFirstListInJava.add("Hello Really!");
        myFirstListInJava.add("Hello Roboto!");
        myFirstListInJava.add(0, "Hello Seadog");

        myFirstListInJava.remove(1);
        myFirstListInJava.set(1, "Hello Peblee!");
        System.out.println(myFirstListInJava);

        ArrayList<String> sameAsTheFirstList = new ArrayList<>();
        sameAsTheFirstList.addAll(myFirstListInJava);
        System.out.println(sameAsTheFirstList);

//        List<String> etc = new Arrays.asList("Hello", "hi", "Hola");
//        ArrayList<String> etcb= new ArrayList<>(Arrays.asList("Hello", "hi", "Hola"));

        HashMap<Integer, String> daysOfTheWeek = new HashMap<>();
        daysOfTheWeek.put(1, "Monday");
        daysOfTheWeek.put(2, "Thuesday");
        daysOfTheWeek.put(3, "Wednesday");
        daysOfTheWeek.put(4, "Thursday");
        daysOfTheWeek.put(5, "Friday");
        daysOfTheWeek.put(6, "Saturday");
        daysOfTheWeek.put(7, "Sunday");

        System.out.println(daysOfTheWeek.get(4));
    }
}
