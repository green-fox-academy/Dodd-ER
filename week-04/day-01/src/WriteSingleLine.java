import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        ArrayList<String> myName = new ArrayList<>();
        myName.add(0, "Mészáros Zoltán  student");
        try {
            Path filePath = Paths.get("my-file.txt");
            Files.readAllLines(filePath);
            Files.write(filePath, myName);
        } catch (Exception e){
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}
