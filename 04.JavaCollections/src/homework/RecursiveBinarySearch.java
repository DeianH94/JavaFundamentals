package homework;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        int numberToFind = consoleInput.nextInt();
        consoleInput.nextLine();
        String[] inputArray =  consoleInput.nextLine().split(" ");

        int[] numbers = new int[inputArray.length];
        // Fills the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        consoleInput.close();

        // Finds the index of the numberToFind in the array
        int index = recursiveBinarySearch(numberToFind, numbers, 0, numbers.length - 1);
        System.out.println(index);
    }

    // It doesn't work properly. It finds random array element that
    // is equal to the numberToFind and not the element whit the smallest index.
    private static int recursiveBinarySearch(int numberToFind, int[] numbers, int startIndex, int lastIndex) {
        if  (lastIndex - startIndex <= 1){
            if (numbers[startIndex] == numberToFind){
                return startIndex;
            }
            if (numbers[lastIndex] == numberToFind){
                return lastIndex;
            }

            return  -1;
        }
        int middleIndex = (lastIndex + startIndex) / 2;
        if (numbers[middleIndex] > numberToFind){
            return recursiveBinarySearch(numberToFind, numbers, 0, middleIndex);
        } else {
            return recursiveBinarySearch(numberToFind, numbers, middleIndex, lastIndex);
        }
    }
}
