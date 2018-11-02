import java.util.Arrays;

public class Unique {

//        //  Create a function that takes a list of numbers as a parameter
//        //  Returns a list of numbers where every number in the list occurs only once
//
//        //  Example
//        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
//        //  should print: `[1, 11, 34, 52, 61]`

    public static String unique(int[] numbers){
        String result = "";

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            if (i == numbers.length - 1){
                result += (numbers[i]);
            } else {
                if (numbers[i] != numbers[i + 1]){
                    result += (numbers[i] + ", ");
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("1, 11, 34, 11, 52, 61, 1, 34");
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
    }
}
