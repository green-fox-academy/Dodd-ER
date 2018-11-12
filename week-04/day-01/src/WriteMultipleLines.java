import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args){
        // Create a function that takes 3 parameters: a path, a word and a number,
        // than it should write to a file.
        // The path parameter should be a string, that describes the location of the file.
        // The word parameter should be a string, that will be written to the file as lines
        // The number paramter should describe how many lines the file should have.
        // So if the word is "apple" and the number is 5, than it should write 5 lines
        // to the file and each line should be "apple"
        // The function should not raise any error if it could not write the file.
        Path filePath = Paths.get("my-apples.txt");
        String apple = "ápplé";
        int inputNum = 5;

        writeMultiLineFunction(filePath, apple, inputNum);
    }

    public static void writeMultiLineFunction(Path filePath, String word, int numOfLines){
        List<String> myList = new ArrayList<>();
        for (int i = 0; i <= (numOfLines - 1); i++){
            myList.add(i, word);
        }
        try {
            //Files.readAllLines(filePath);
            Files.write(filePath, myList);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}