package SoftUni;

import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {
        String path = "files/Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources";
        File folder = new File(path);
        int size = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            int fileSize = (int) file.length();
            size += fileSize;
        }

        System.out.println("Folder size: " + size);
    }
}
