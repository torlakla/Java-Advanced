package Lab.StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteToFile_02 {
    public static void main(String[] args) {
        String pathIn = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output-02.txt";
        List<Character> symbolList = new ArrayList<>(Arrays.asList('.', ',', '?', '!'));

        try {
            InputStream fileInput = new FileInputStream(pathIn);
            OutputStream fileOutput=new FileOutputStream(pathOut);
            int readByte = fileInput.read();
            while (readByte != -1) {
                if (!symbolList.contains((char)readByte)) {
                    fileOutput.write(readByte);

                }


                readByte = fileInput.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
