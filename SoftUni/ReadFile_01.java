package SoftUni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile_01 {
    public static void main(String[] args) {
        String path = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\input.txt";

        try (InputStream inputStream = new FileInputStream(path)) {
            int oneByte = inputStream.read();

            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = inputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
