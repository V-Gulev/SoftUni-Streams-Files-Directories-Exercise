package SoftUni;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\input.txt";
        String outPath = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\04.ExtractIntegersOutput.txt";
        InputStream inputStream = new FileInputStream(path);
        Scanner sc = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(new FileOutputStream(outPath));

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
               out.println(sc.nextInt());
            }
            sc.next();
        }
        out.close();

    }
}
