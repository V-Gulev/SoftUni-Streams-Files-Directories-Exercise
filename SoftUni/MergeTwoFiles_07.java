package SoftUni;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {
        String inputOne = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/inputOne.txt";
        String inputTwo = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/inputTwo.txt";

        List<String> allLineOne = Files.readAllLines(Path.of(inputOne));
        List<String> allLineTwo = Files.readAllLines(Path.of(inputTwo));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/output.txt"));

        for (String s : allLineOne) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        for (String s : allLineTwo) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
