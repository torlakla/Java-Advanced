package Exercise.StreamsFileAndDirectories;

import java.io.*;
import java.nio.file.Path;

public class AllCapitals_03 {
    public static void main(String[] args) {
        String inPath="C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath="C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output-03.txt";

        try{
            BufferedReader input=new BufferedReader(new FileReader(inPath));
            PrintWriter output = new PrintWriter( new FileWriter(outPath));
            String line=input.readLine();
            while (line!=null){
               line=line.toUpperCase();
               output.println(line);


                line=input.readLine();
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
