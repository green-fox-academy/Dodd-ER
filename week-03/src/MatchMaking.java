import java.util.ArrayList;
import java.util.Arrays;
import  java.lang.String;

public class MatchMaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> inputArrayList1, ArrayList<String> inputArrayList2){
        ArrayList<String> outputArrayList = new ArrayList<>();
        for (int i = 0; i < inputArrayList1.size(); i++){
            outputArrayList.add(inputArrayList1.get(i) + " - " + inputArrayList2.get(i));
        // with bash it looks better
        }

        return outputArrayList;
    }
}
