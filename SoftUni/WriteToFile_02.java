package SoftUni;

import java.io.*;

public class WriteToFile_02 {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\input.txt";
        String outputPath = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\02.WriteToFileOutput.txt";

        try (
                InputStream inputStream = new FileInputStream(inputPath);
                OutputStream outputStream = new FileOutputStream(outputPath)
        ) {
            int oneByte = inputStream.read();
            while (oneByte >= 0) {
                char symbol = (char) oneByte;
                if (symbol != ',' && symbol != '.' && symbol != '!' && symbol != '?') {
                    outputStream.write(oneByte);
                }
                oneByte = inputStream.read();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
