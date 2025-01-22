package SoftUni;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {
        String inputPath = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/words.txt";
        String outputPath = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/text.txt";

        Map<String, Integer> countWords = new HashMap<>();
        List<String> allLinesWithWords = Files.readAllLines(Path.of(inputPath));
        for (String line : allLinesWithWords) {
            Arrays.stream(line.split("\\s+")).forEach(word -> countWords.put(word, 0));
        }
        List<String> allLinesFromText = Files.readAllLines(Path.of(outputPath));
        for (String line : allLinesFromText) {
            Arrays.stream(line.split("\\s+"))
                    .forEach(word -> {
                        if (countWords.containsKey(word)) {
                            int currentCount = countWords.get(word);
                            countWords.put(word, currentCount + 1);
                        }
                    });
        }
        PrintWriter writer = new PrintWriter("files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/result.txt");
        countWords.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();


    }
}
