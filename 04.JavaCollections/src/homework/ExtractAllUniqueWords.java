package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        // Uses regex to split by non- letter characters.
        String[] inputArray =  consoleInput.nextLine().split("\\W+");
        consoleInput.close();

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (!words.contains(inputArray[i].toLowerCase())) {
                words.add(inputArray[i].toLowerCase());
            }
        }

        // prints the list to the console
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
