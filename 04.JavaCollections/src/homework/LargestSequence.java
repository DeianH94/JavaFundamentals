package homework;

import java.util.Scanner;

public class LargestSequence {
    public static void main(String[] args) {
        // Reads from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] inputString = consoleInput.nextLine().split("[ ]+");
        consoleInput.close();

        int currentLength = 1;
        int maxLength = 1;
        String largestRepeatingString = inputString[0];

        // Checks if each element from the array equals the one after him.
        for (int i = 0; i < inputString.length - 1; i++) {
            if (inputString[i].equals(inputString[i + 1])) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    largestRepeatingString = inputString[i];
                }
            } else {
                currentLength = 1;
            }
        }

        // Prints the longest sequence
        for (int i = 0; i < maxLength; i++){
            System.out.print(largestRepeatingString + " ");
        }
    }
}
