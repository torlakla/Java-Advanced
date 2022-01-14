package Lab.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile_01 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {
            FileInputStream fileStream = new FileInputStream(path);
            int oneByte = fileStream.read();
            while (oneByte !=-1) {
                String decimalValueOfOnebyte = Integer.toBinaryString(oneByte);
                System.out.print(decimalValueOfOnebyte+ " ");
                oneByte=fileStream.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}

