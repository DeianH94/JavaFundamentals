package homework;

import java.io.*;

public class AllCapitals {
    private static final String FILE_PATH = "resources/lines.txt";
    private static final String SAVE_PATH = "resources/new_line.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
             PrintWriter writer = new PrintWriter(new FileWriter(SAVE_PATH, false), true)) {
            String line = reader.readLine();

            while (line != null) {
                String output = line.toUpperCase();
                writer.println(output);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        }
    }
}
