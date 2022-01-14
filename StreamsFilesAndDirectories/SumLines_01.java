package Exercise.StreamsFileAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {

        Path path=Path.of("C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines=new ArrayList<>();
                lines=Files.readAllLines(path);
        for (String line : lines) {
            int sum=0;
            for (char symbol : line.toCharArray()) {
                sum+=symbol;
            }
            System.out.println(sum);

        }


    }
}
