package SoftUni;

import java.io.*;

public class CopyBytes_03 {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\input.txt";
        String outputPath = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\03.CopyBytesOutput.txt";
        try (
                InputStream inputStream = new FileInputStream(inputPath);
                OutputStream outputStream = new FileOutputStream(outputPath)
        ) {
            int oneByte = inputStream.read();
            while (oneByte >= 0) {
                if (oneByte == 32 || oneByte == 10) {
                    outputStream.write(oneByte);
                } else {
                    String asciiCode = String.valueOf(oneByte);
                    for (int i = 0; i < asciiCode.length(); i++) {
                        outputStream.write(asciiCode.charAt(i));
                    }
                }
                oneByte = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}