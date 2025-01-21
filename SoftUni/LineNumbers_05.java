package SoftUni;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {
        String inputPath = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/inputLineNumbers.txt";
        List<String> allLines = Files.readAllLines(Path.of(inputPath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/output.txt"));
        int lineIndex = 1;
        for (String line : allLines) {
            bufferedWriter.write(lineIndex + ". " + line);
            bufferedWriter.newLine();
            lineIndex++;
        }
        bufferedWriter.close();





    }
}
