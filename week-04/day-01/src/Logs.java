import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        String fileName = "log.txt";
        for (String elements : getIpAddresses(fileName)) {
            System.out.println(elements);
        }
        System.out.println("The GET, POST request ratio: " + getGetPostRatio(fileName));
    }

    public static ArrayList<String> getListFromFile(String fileName){
        Path filePath = Paths.get(fileName);
        ArrayList<String> logFileContent;
        try {
            logFileContent = (ArrayList<String>) Files.readAllLines(filePath);
            return logFileContent;
        } catch (Exception e){
            logFileContent = new ArrayList<>();
            return logFileContent;
        }
    }

    public static String[] getArrayFromLists(ArrayList<String> inputArrayList, int numOfArray){
        String[] arrayWanted = new String[inputArrayList.size()];
        for (int i = 0; i < inputArrayList.size(); i++){
            String[] linesContent = new String[3];
            for (int j = 0; j <= 2; j++){
                linesContent = inputArrayList.get(i).split("   ");
            }
            arrayWanted[i] = linesContent[numOfArray];
        }
        return arrayWanted;
    }

    public static String[] getIpAddresses(String fileName) {
        String[] ipAddresses = getArrayFromLists(getListFromFile(fileName), 1);
        return ipAddresses;
    }

    public static double getGetPostRatio(String fileName){
        String[] getPost = getArrayFromLists(getListFromFile(fileName), 2);
        double gets = 0;
        double posts = 0;

        for (int i = 0; i < getPost.length; i++) {
            if (getPost[i].equals("GET /")){
                gets++;
            }else {
                posts++;
            }
        }

        return (gets / posts);
    }
}
