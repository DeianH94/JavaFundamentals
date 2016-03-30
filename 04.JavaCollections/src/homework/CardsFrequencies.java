package homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] inputArray =  consoleInput.nextLine().split("[\\W\\s]+");
        int counter = 0;
        LinkedHashMap<String,Integer> cardsFrequencies = new LinkedHashMap<>();


        for (String word : inputArray) {
            if (!cardsFrequencies.containsKey(word)) {
                cardsFrequencies.put(word, 0);
            }

            cardsFrequencies.put(word, cardsFrequencies.get(word) + 1);
            counter++;
        }

        // Prints all the card faces and how frequent they appear
        for (Map.Entry<String, Integer> cards : cardsFrequencies.entrySet()) {
            System.out.printf("%s -> %.2f%%\n" ,cards.getKey(),
                    ((double)cards.getValue()/counter)*100);
        }
    }
}
