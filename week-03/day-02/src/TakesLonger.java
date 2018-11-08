import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String missingQuote = "always takes longer than";
        ArrayList<String> arrayListOfQuote = new ArrayList<>(Arrays.asList(quote.split(" ")));

        arrayListOfQuote.add(3, missingQuote);

        for (String elements : arrayListOfQuote) {
            System.out.print(elements + " ");
        }
    }
}
