package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    private static final String FILE_PATH = "resources/lines.txt";

    public static void main(String[] args) {
        try(BufferedReader input = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = input.readLine();

            while (line != null){
                char[] lineArgs = line.toCharArray();
                int sum = 0;
                for (int i = 0; i < lineArgs.length; i++) {
                    sum += (int)lineArgs[i];
                }

                System.out.println(sum);
                line = input.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        }
    }
}
