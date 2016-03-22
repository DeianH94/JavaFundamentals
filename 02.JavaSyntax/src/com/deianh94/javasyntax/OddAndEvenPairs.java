package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner consoleInput = new Scanner(System.in);
        String[] inputString = consoleInput.nextLine().split("[ ]+");
        consoleInput.close();

        if (inputString.length % 2 != 0) {
            System.out.println("Invalid length");
        }
        else {
            int[] numbers = new int[inputString.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(inputString[i]);
            }

            for (int i = 0; i < inputString.length; i = i + 2) {
                if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0){
                    System.out.printf("%d, %d -> both are even", numbers[i], numbers[i + 1]);
                    System.out.println();
                }
                else if (numbers[i] % 2 != 0 && numbers[i + 1] % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd", numbers[i], numbers[i + 1]);
                    System.out.println();
                }
                else {
                    System.out.printf("%d, %d -> different", numbers[i], numbers[i + 1]);
                    System.out.println();
                }
            }
        }
    }
}
