package SoftUni;

import java.io.File;

public class ListFiles_07 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\Files-and-Streams");
        File[] files = folder.listFiles();
        for (File file : files) {
            if (!file.isDirectory()) {
                System.out.printf("%s: [%d]\n", file.getName(), file.length());
            }
        }


    }
}
