import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Anagram {

    public static boolean anagram(char[] firstArray, char[] secondArray) {
        //Metod ami két tömböt vizsgál, hogy elemei egyeznek-e

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        boolean answer = true;

        if (firstArray.length != secondArray.length) {
            answer = false;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    answer = false;
                } else {
                    answer = true;
                }
                break;
            }
        }
        return answer;
    }

    public static char[] makeArray(String word) {
        //metod ami szavakból tömböket készít

        char[] finishedArray = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            finishedArray[i] = word.charAt(i);
        }
        return finishedArray;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please write your first word: ");
        String firstWord = sc.nextLine();

        System.out.println("Please write your second word: ");
        String secondWord = sc.nextLine();

        char[] firstArray = makeArray(firstWord);
        char[] secondArray = makeArray(secondWord);

        System.out.println("Your two words are anagram?:" + anagram(firstArray, secondArray));
        
    }

}
