package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        int a = consoleInput.nextInt();
        double b = consoleInput.nextDouble();
        double c = consoleInput.nextDouble();
        int aBinary = Integer.parseInt(Integer.toBinaryString(a));

        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, aBinary, b, c);
    }
}
