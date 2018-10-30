public class SumElements {
    // - Create an array variable named `r`
    //   with the following content: `[54, 23, 66, 12]`
    // - Print the sum of the second and the third element

    private static int printSum(int[] arrayOfInts){
        int sum = arrayOfInts[1] + arrayOfInts[2];

        return sum;
    }

    public static void main(String[] args){
        int[] r = {54, 23, 66, 12};
        System.out.println("Teh second and the third elements sum is " + printSum(r));
    }
}
