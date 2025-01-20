package SoftUni;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\input.txt");
        Path outputPath = Paths.get("C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\06.SortLinesOutput.txt");

        List<String> allLines = Files.readAllLines(inputPath);
        Collections.sort(allLines);
        Files.write(outputPath, allLines);

    }
}
