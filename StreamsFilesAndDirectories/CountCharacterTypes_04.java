package Exercise.StreamsFileAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountCharacterTypes_04 {
    public static void main(String[] args) {
        String inPath = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath = "C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output-04.txt";
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        List<Character> punctuations = new ArrayList<>(Arrays.asList('?', '!', ',', '.'));
        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationsCount = 0;

        try {
            BufferedReader input = new BufferedReader(new FileReader(inPath));
            PrintWriter output = new PrintWriter(new FileWriter(outPath));
            int nextByte = input.read();
            while (nextByte >= 0) {
                if (vowels.contains((char) nextByte)) {
                    vowelsCount++;
                } else if (punctuations.contains((char) nextByte)) {
                    punctuationsCount++;
                } else {
                    if (nextByte == 10 || nextByte==32 || nextByte==16 ||nextByte==13) {
                        nextByte = input.read();
                        continue;
                    } else {
                        consonantsCount++;
                    }
                }
                nextByte = input.read();
            }
            output.println("Vowels: " + vowelsCount);
            output.println("Consonants: " + consonantsCount);
            output.println("Punctuation: " + punctuationsCount);

            output.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
