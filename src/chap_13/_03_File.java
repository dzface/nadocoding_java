package chap_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class _03_File {
    public static void main(String[] args) {
        String fileName = "test.txt";
        File file = new File(fileName);
        try {
            file.createNewFile();
            if (file.exists()) {
                System.out.println("file name: "+fileName);
                System.out.println("file absolute path: "+file.getAbsolutePath());
                System.out.printf("file volume(Byte): "+ file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
