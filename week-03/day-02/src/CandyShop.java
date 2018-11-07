import java.lang.reflect.Array;
import java.util.ArrayList;

public class CandyShop {
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }
    public static ArrayList<String> sweets(ArrayList<Object> inputArrayList){
        ArrayList<String> outputArrayList = new ArrayList<>();
        for (int i = 0; i < inputArrayList.size(); i++){
            if (inputArrayList.get(i) == (Object)2){
                outputArrayList.add(i, "Croissant");
            } else if (inputArrayList.get(i) == (Object)false ){
                outputArrayList.add(i, "Ice cream");
            } else {
                outputArrayList.add(i, (String)inputArrayList.get(i));
            }
        }
        return outputArrayList;
    }
}
