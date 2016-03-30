package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String firstString = consoleInput.nextLine();
        String secondString = consoleInput.nextLine();
        consoleInput.close();

        // Adds the first line from the console in the outputList
        ArrayList<Character> outputList = new ArrayList<>();
        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) != ' ') {
                outputList.add(firstString.charAt(i));
            }
        }

        // Checks if the second line from the console contains characters from the first list
        ArrayList<Character> tempList = new ArrayList<>();
        for (int i = 0; i < secondString.length(); i++) {
            if (secondString.charAt(i) != ' '
                    && !outputList.contains(secondString.charAt(i))) {
                tempList.add(secondString.charAt(i));
            }
        }

        // Adds the second list to the first
        outputList.addAll(tempList);

        // Prints the list
        for (char element : outputList) {
            System.out.print(element + " ");
        }
    }
}
