package SoftUni;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\input.txt";
        String outputPath = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\05.WriteEveryThirdLineOutput.txt";

        try (
                BufferedReader bufferedReader = Files.newBufferedReader(Path.of(inputPath));
                BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(outputPath))
        ) {
            String line = bufferedReader.readLine();
            int counter = 0;
            while (line != null) {
                counter++;
                if (counter % 3 == 0) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

                line = bufferedReader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
