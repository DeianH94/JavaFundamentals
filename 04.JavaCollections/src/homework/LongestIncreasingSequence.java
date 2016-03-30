package homework;

import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        // Read the input sequence of n integers
        Scanner consoleInput = new Scanner(System.in);
        String[] inputArray =  consoleInput.nextLine().split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        int startOfSequence = 0;
        int sequenceLength = 1;
        int currentLength = 1;

        System.out.print(inputArray[0] + " ");
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] <= numbers[i - 1])
            {
                System.out.println();
                if (currentLength > sequenceLength)
                {
                    sequenceLength = currentLength;
                    startOfSequence = i - currentLength;
                }

                currentLength = 0;
            }

            System.out.print(numbers[i] + " ");
            currentLength++;
        }

        if (currentLength > sequenceLength)
        {
            sequenceLength = currentLength;
            startOfSequence = numbers.length - currentLength;
        }

        System.out.println();
        // Prints the longest sequence to the console
        System.out.print("Longest: ");
        for (int i = startOfSequence; i < startOfSequence + sequenceLength; i++)
        {
            System.out.print(inputArray[i] + " ");
        }
    }
}
