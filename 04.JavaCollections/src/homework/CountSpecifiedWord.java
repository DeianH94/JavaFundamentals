package homework;

import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        // Uses regex to split by non- letter characters.
        String[] inputArray =  consoleInput.nextLine().split("\\W+");
        String wordToFind = consoleInput.next();
        consoleInput.close();

        int count = 0;
        for (String word: inputArray) {
            // Makes both string lowercase before comparing them
            if (word.toLowerCase().equals(wordToFind.toLowerCase())) {
                count++;
            }
        }

        // Prints the result
        System.out.println(count);
    }
}
