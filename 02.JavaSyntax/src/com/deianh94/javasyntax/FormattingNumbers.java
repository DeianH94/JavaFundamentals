package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner consoleInput = new Scanner(System.in);
        int a = consoleInput.nextInt();
        double b = consoleInput.nextDouble();
        double c = consoleInput.nextDouble();
        consoleInput.close();
        int aBinary = Integer.parseInt(Integer.toBinaryString(a));

        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, aBinary, b, c);
    }
}
