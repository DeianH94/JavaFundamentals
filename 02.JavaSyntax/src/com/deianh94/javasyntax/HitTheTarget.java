package com.deianh94.javasyntax;

import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int target = consoleInput.nextInt();
        consoleInput.close();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target) {
                    System.out.printf("%d + %d == %d", i, j, target);
                    System.out.println();
                }
                if (i - j == target) {
                    System.out.printf("%d - %d == %d", i, j, target);
                    System.out.println();
                }
            }
        }
    }
}
