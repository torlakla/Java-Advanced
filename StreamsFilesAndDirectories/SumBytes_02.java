package Exercise.StreamsFileAndDirectories;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumBytes_02 {
    public static void main(String[] args) throws IOException {
        Path path=Path.of("C:\\Users\\Alkin\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        BigInteger totalSum= new BigInteger("0");
        List<String> lines=new ArrayList<>();
        lines= Files.readAllLines(path);
        for (String line : lines) {
            int sum=0;
            for (char symbol : line.toCharArray()) {
                sum+=symbol;
            }
            totalSum=totalSum.add(BigInteger.valueOf(sum));

        }
            System.out.println(totalSum);
    }
}
