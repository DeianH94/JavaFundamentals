package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCharacterTypes {
    private static final String FILE_PATH = "resources/words.txt";

    public static void main(String[] args) {
        try(BufferedReader input = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = input.readLine();
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            while (line != null){
                char[] lineArgs = line.toCharArray();

                for (int i = 0; i < lineArgs.length; i++) {
                    if (lineArgs[i] == 'a' || lineArgs[i] == 'e' || lineArgs[i] == 'i'
                            || lineArgs[i] == 'o' || lineArgs[i] == 'u') {
                        vowels++;
                    } else if (lineArgs[i] == '.' || lineArgs[i] == '?'
                            || lineArgs[i] == '!' || lineArgs[i] == ',') {
                        punctuation++;
                    } else if (lineArgs[i] != ' ') {
                        consonants++;
                    }
                }

                line = input.readLine();
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Punctuation: " + punctuation);
        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        }
    }
}
