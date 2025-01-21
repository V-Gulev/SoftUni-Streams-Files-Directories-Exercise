package SoftUni;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountCharacterTypes_04 {
    public static void main(String[] args) throws IOException {
        String inputPath = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/input.txt";
        String content = Files.readString(Path.of(inputPath));
        content = content.replaceAll("\\s+", "");
        Set<Character> vowels = new HashSet<>();
        Set<Character> punctuation = new HashSet<>();
        Collections.addAll(vowels,'a','e','i','o','u');
        Collections.addAll(punctuation, ',', '.', '?', '!');
        int vowelsCounter = 0;
        int punctuationCounter = 0;
        int otherSymbolCounter = 0;
        for (char ch : content.toCharArray()) {

            if (vowels.contains(ch)) {
                vowelsCounter++;
            } else if (punctuation.contains(ch)) {
                punctuationCounter++;
            } else otherSymbolCounter++;

        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/output.txt"));
        writer.write("Vowels: " + vowelsCounter);
        writer.newLine();
        writer.write("Other symbols: " + otherSymbolCounter);
        writer.newLine();
        writer.write("Punctuation: " + punctuationCounter);
        writer.close();

    }
}
