import java.util.ArrayList;
import java.util.Arrays;

public class JosephusProblem {
    public static void main(String[] args){
        System.out.println(josephusProblem(1));
        System.out.println(josephusProblem(2));
        System.out.println(josephusProblem(3));
        System.out.println(josephusProblem(7));
        System.out.println(josephusProblem(12));
        System.out.println(josephusProblem(41));
    }

    public static int josephusProblem(int inputNum){
        ArrayList<Integer> josephusCircle = new ArrayList<>(Arrays.asList(new Integer[inputNum]));
        int k= 0;

        for (int i = 1; i <= inputNum; i++){
            if (1 < inputNum) {
                if (1 < josephusCircle.size()) {
                    josephusCircle.set(i, 1);
                    k = i;
                } else {
                    break;
                }
            } else {
                k = inputNum;
            }
        }
        return k;
    }
}
