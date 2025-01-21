package SoftUni;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {
        String inputPath = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/input.txt";
        String upperCase = Files.readString(Path.of(inputPath)).toUpperCase();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/output.txt"));
        bufferedWriter.write(upperCase);
        bufferedWriter.close();
    }
}
