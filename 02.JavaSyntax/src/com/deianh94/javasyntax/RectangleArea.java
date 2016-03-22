package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Input the sides of the rectangle:");
        Scanner consoleInput = new Scanner(System.in);
        int sideA = consoleInput.nextInt();
        int sideB = consoleInput.nextInt();
        consoleInput.close();
        System.out.println("The area of the rectangle is: " + (sideA * sideB));
    }
}
