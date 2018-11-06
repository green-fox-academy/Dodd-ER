import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;

public class QuoteSwap {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.


            for (String elements : quoteSwap(list)){
                System.out.print(elements + " ");
            }

        // Expected output: "What I cannot create I do not understand."
    }

    public static ArrayList<String> quoteSwap(ArrayList<String> inputArrayList){
        ArrayList<String> outputArrayList = new ArrayList<>(inputArrayList);
        
        outputArrayList.set(inputArrayList.indexOf("do"), "cannot");
        outputArrayList.set(inputArrayList.indexOf("cannot"), "do");

        return outputArrayList;
    }
}
