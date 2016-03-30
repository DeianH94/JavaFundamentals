package homework;

import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        // Reads from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] inputString = consoleInput.nextLine().split("[ ]+");
        consoleInput.close();

        System.out.printf(inputString[0] + " ");
        // Checks if each element from the array equals the one before him.
        for (int i = 1; i < inputString.length; i++) {
            if (!inputString[i].equals(inputString[i - 1])) {
                System.out.println();
            }

            System.out.printf(inputString[i] + " ");
        }
    }
}
