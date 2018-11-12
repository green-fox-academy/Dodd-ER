import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        String source = "my-apples.txt";
        System.out.println(copyFileFunction(source, "my-copyOFApples.txt"));
    }

    public static boolean copyFileFunction(String source, String copyFileName) {
        Path filePath = Paths.get(source);

        try {
            List<String> linesOfFirstFile = Files.readAllLines(filePath);
            Files.write(Paths.get(copyFileName), linesOfFirstFile);
        return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
