import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

public class AppendLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        // The output should be: "boa", "anaconda", "koala", "panda", "zebra"

        System.out.println(appendA(far));
    }

    public static ArrayList<String> appendA(List<String> inputList){
        ArrayList<String> outputArrayList = new ArrayList<>();
        for (String elements : inputList) {
            outputArrayList.add(elements + "a");
        }
        return outputArrayList;
    }
}
