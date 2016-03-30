package homework;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        int numberToFind = consoleInput.nextInt();
        consoleInput.close();

        // Prints the result to the console
        System.out.println(factorial(numberToFind));
    }

    static int factorial(int n) {
        // The bottom of the recursion
        if (n == 0) {
            return 1;
        }
        // Recursive call: the method calls itself
        else {
            return n * factorial(n - 1);
        }
    }
}
