import java.util.Scanner;

public class PalindromeBuilder {

    public static  char[] palindrom(char[] inputArray){
        char[] newArray = new char[inputArray.length];
        char[] finalArray = new char[inputArray.length * 2];
        int k = 0;

        for (int i = (inputArray.length -1);i >= 0; i--){
            newArray[k] = inputArray[i];
            k++;
        }
        //finalArray = inputArray + newArray

        for (int i = 0; i < inputArray.length; i++){
            finalArray[i] = inputArray[i];
        }

        for (int i = 0; i < inputArray.length; i++){
            finalArray[k] = newArray[i];
            k++;
        }

        return finalArray;
    }

    public static char[] makeArray(String inputWorld){
        char[] newArray = new char[inputWorld.length()];

        for (int i = 0; i < inputWorld.length(); i++){
            newArray[i] = inputWorld.charAt(i);
        }
        return newArray;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a world:");
        String world = sc.nextLine();

        System.out.println(palindrom(makeArray(world)));



    }

}
