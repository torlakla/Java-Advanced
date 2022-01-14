package Lab.StreamsFilesAndDirectories;

import java.io.*;

public class CopyBytes_03 {
    public static void main(String[] args) {

        String inPath = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output-03.txt";

        try {
            InputStream inStream = new FileInputStream(inPath);
            PrintStream outStream = new PrintStream(outPath);
            int nextByte = 0;
            nextByte = inStream.read();
            while (nextByte != -1) {
                if (nextByte == 32 || nextByte == 10) {
                    outStream.write(nextByte);
                } else {
                    outStream.print((char)nextByte);
//                    String digits = String.valueOf(nextByte);
//                    for (int i = 0; i < digits.length(); i++)
//                        outStream.write(digits.charAt(i));

                }

                nextByte = inStream.read();
            }


        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }


    }
}
