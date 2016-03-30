package homework;

import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int numbersLength = consoleInput.nextInt();
        int[] inputArray = new int[numbersLength];

        // Fills the array
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = consoleInput.nextInt();
        }

        consoleInput.close();

        // Sorts the array using selection sort
        for (int i = 0; i < inputArray.length - 1; i++) {
            int posMin = i;

            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[posMin])
                {
                    posMin = j;
                }
            }

            if (posMin != i) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[posMin];
                inputArray[posMin] = temp;
            }
        }

        // Prints the sorted array
        for (int number: inputArray) {
            System.out.print(number + " ");
        }
    }
}
