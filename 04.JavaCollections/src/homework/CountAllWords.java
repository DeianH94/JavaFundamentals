package homework;

import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        // Uses regex to split by non- letter characters.
        String[] inputArray = consoleInput.nextLine().split("\\W+");
        consoleInput.close();

        // Prints the result to the console
        System.out.print(inputArray.length);
    }
}
