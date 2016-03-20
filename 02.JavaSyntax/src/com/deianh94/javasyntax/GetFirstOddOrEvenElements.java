package com.deianh94.javasyntax;

import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        String[] inputString = consoleInput.nextLine().split("[ ]+");
        String[] command = consoleInput.nextLine().split("[ ]+");
        consoleInput.close();

        int[] numbers = new int[inputString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputString[i]);
        }

        int numOfElements = Integer.parseInt(command[1]);
        String OddOrEven = command[2];

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            if (OddOrEven.equals("even")) {
                if (numbers[i] % 2 == 0 && count < numOfElements) {
                    System.out.print(numbers[i] + " ");
                }
            }
            else {
                if (numbers[i] % 2 != 0 && count < numOfElements) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
