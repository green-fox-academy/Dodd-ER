import java.util.Scanner;
import java.lang.String;

public class Anagram {

    public static boolean anagram(char[] firstArray, char[] secondArray) {
        boolean answer = true;
        if (firstArray.length != secondArray.length) {
            answer = false;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < secondArray.length; i++) {
                    answer = true;
                }
            }
        }
        return answer;
    }

    public static char[] makeArray(String word) {
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

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
        }

        System.out.println();

        for (int j = 0; j < secondArray.length; j++) {
            System.out.print(secondArray[j]);
        }
        System.out.println();
        System.out.println("Your two words are anagram?:");

        System.out.println(anagram(firstArray, secondArray));

    }

}
