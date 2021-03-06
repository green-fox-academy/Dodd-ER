package domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> newListOfDominoes = new ArrayList<>();

        for (int i = 0; i < dominoes.size(); i++) {
            if (i == 0){
                newListOfDominoes.add(i, dominoes.get(i));
            } else {
                for (int j = 0; j < dominoes.size(); j++) {
                    if (newListOfDominoes.get(newListOfDominoes.size() - 1).getRightSide() == dominoes.get(j).getLeftSide()) {
                        newListOfDominoes.add(i, dominoes.get(j));
                        break;
                    }
                }
            }
        }
        System.out.println(dominoes);
        System.out.println(newListOfDominoes);
        System.out.println();
        Collections.sort(dominoes);

        for (Domino item : dominoes) {
            System.out.print(item);
        }

    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
