package com.deianh94.javasyntax;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Input the two string");
        String firstString = consoleInput.next();
        String secondString = consoleInput.next();
        consoleInput.close();

        int totalSum = multiplyCharacters(firstString, secondString);
        System.out.println(totalSum);
    }

    private static int multiplyCharacters(String firstString, String secondString) {
        int totalSum = 0;
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                totalSum += firstString.charAt(i) * secondString.charAt(i);
            }

        } else if (firstString.length() > secondString.length()) {
            for (int i = 0; i < secondString.length(); i++) {
                totalSum += firstString.charAt(i) * secondString.charAt(i);
            }

            for (int i = secondString.length(); i < firstString.length(); i++) {
                totalSum += firstString.charAt(i);
            }

        } else if (firstString.length() < secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                totalSum += firstString.charAt(i) * secondString.charAt(i);
            }

            for (int i = firstString.length(); i < secondString.length(); i++) {
                totalSum += secondString.charAt(i);
            }
        }

        return totalSum;
    }
}
