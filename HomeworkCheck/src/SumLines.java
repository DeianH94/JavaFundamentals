import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SumLines {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        ArrayList<Integer> outputResult = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Blago\\IdeaProjects\\Homework_ Java_Streams\\src\\sumlines.txt")))
        {
            String inputLine;
            while((inputLine = reader.readLine())!=null) {
                int currentSum = 0;
                for (int i = 0; i < inputLine.length(); i++) {
                    currentSum+=inputLine.charAt(i);
                }
                outputResult.add(currentSum);
            }
        }

        for (int i = 0; i < outputResult.size(); i++) {
            System.out.println(outputResult.get(i));
        }

    }
}

