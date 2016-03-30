package homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentWord {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        // Uses regex to split by non- letter characters.
        String[] inputArray =  consoleInput.nextLine().toLowerCase().split("\\W+");
        TreeMap<String, Integer> arrayOfWords = new TreeMap<>();

        // Adds elements to the map
        for (String word : inputArray) {
            if(!arrayOfWords.containsKey(word)) {
                arrayOfWords.put(word, 0);
            }

            arrayOfWords.put(word, arrayOfWords.get(word) + 1);
        }

        int counter = 0;
        // Finds how many times the most frequent word appears
        for (HashMap.Entry<String, Integer> counterWords : arrayOfWords.entrySet()) {
            if (counter < counterWords.getValue())
                counter = counterWords.getValue();
        }

        // Prints all elements that have the same value as the counter
        for (HashMap.Entry<String, Integer> counterWords : arrayOfWords.entrySet()) {
            if (counter == counterWords.getValue())
                System.out.println(counterWords.getKey() + " -> " + counterWords.getValue() + " times");
        }
    }
}
