package SoftUni;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
        String inputPath = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/input.txt";
        List<String> allLines = Files.readAllLines(Path.of(inputPath));
        allLines.stream()
                .map(String::toCharArray)
                .forEach(arr -> {
                    int sum = 0;
                    for (char symbol : arr) {
                        sum += symbol;
                    }
                    System.out.println(sum);
                });


    }
}
