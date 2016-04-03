package homework;

import java.util.Arrays;
import java.util.Scanner;

public class StreamAPI {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] elements = consoleInput.nextLine().split("\\W+");
        String command = consoleInput.next();
        consoleInput.close();

        if (command.toLowerCase().equals("ascending")) {
            Arrays.stream(elements)
                    .sorted((e1, e2) -> e1.compareTo(e2))
                    .forEach(e -> System.out.print(e + " "));
        } else if (command.toLowerCase().equals("descending")) {
            Arrays.stream(elements)
                    .sorted((e1, e2) -> e2.compareTo(e1))
                    .forEach(e -> System.out.print(e + " "));
        }
    }
}
