package Exercise.StreamsFileAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) {
        String inPath = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        Path path = Path.of("C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        String outPath = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output-06.txt";
        LinkedHashMap<String, Integer> counter = new LinkedHashMap<>();

        try {
            BufferedReader input = new BufferedReader(new FileReader(inPath));

            PrintWriter output = new PrintWriter(new FileWriter(outPath));
            List<String> text=new ArrayList<>();
            text= Files.readAllLines(path);

            String lineInput = input.readLine();
            while (lineInput != null) {
                String[] line = lineInput.split(" ");
                for (String word : line) {

                    counter.putIfAbsent(word, 0);
                }
                lineInput=input.readLine();
            }
            for (String word : text) {


            }
            for (Map.Entry<String, Integer> entry : counter.entrySet()) {
                System.out.println(entry.getKey()+" - " + entry.getValue());

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
