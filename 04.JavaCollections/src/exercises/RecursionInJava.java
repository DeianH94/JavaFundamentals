package exercises;

import java.util.Scanner;

public class RecursionInJava {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        int n = Integer.parseInt(consoleInput.nextLine());
        consoleInput.close();
        printRecursive(n);
    }

    private static void printRecursive (int n) {
        if (n < 1) {
            return;
        }

        System.out.println(n);
        printRecursive(n - 1);
    }
}
