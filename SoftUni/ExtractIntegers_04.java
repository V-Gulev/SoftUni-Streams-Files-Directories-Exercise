package SoftUni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\vilis\\Developer\\JavaAdvanced\\SoftUni-Streams-Files-Directories-Exercise\\files\\Resources\\input.txt";
        InputStream inputStream = new FileInputStream(path);
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            }
            sc.next();
        }


    }
}
