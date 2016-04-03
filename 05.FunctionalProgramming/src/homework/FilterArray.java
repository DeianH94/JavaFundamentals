package homework;

import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] elements = consoleInput.nextLine().split("\\W+");
        consoleInput.close();

        // Filters all elements that are longer than 3 characters
        String[] filtered = Arrays.stream(elements)
                .filter(p -> p.length() > 3)
                .toArray(size -> new String[size]);

        // Prints the filtered array
        if (filtered.length > 0) {
            System.out.println(String.join(" ", filtered));
        } else {
            System.out.println("(empty)");
        }
    }
}
