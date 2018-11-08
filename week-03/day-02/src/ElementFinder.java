import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
//    ---Version 1.0---
//    ---Using For loop---
//
//    public static String containsSeven(ArrayList<Integer> inputArrayList){
//        String outputMessage = "";
//        for (int i = 0; i < inputArrayList.size(); i++){
//            if (inputArrayList.get(i) == 7){
//                outputMessage = "Hoorray";
//            } else {
//                outputMessage = "Noooooo";
//            }
//        }
//        return outputMessage;
//    }

//  ---Version 2.0---
//  ---Using Foreach loop---

    public static String containsSeven(ArrayList<Integer> inputArrayList){
        String outputMessage = "";
        for (Integer elements : inputArrayList){
            if (elements == 7){
                outputMessage = "Hoorray";
            } else {
                outputMessage = "Noooooo";
            }
        }
        return outputMessage;
    }
}
