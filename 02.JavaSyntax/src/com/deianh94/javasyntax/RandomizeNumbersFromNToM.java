package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner consoleInput = new Scanner(System.in);
        int n = consoleInput.nextInt();
        int m = consoleInput.nextInt();
        consoleInput.close();
        int[] arr = new int[m - n + 1];
        arr[0] = n;
        for(int i = 1; i < m - n + 1; i++) {
            arr[i] = arr[i - 1] + 1;
        }

        Random rnd = new Random();
        for (int i = 1; i < arr.length; i++) {
            int j = rnd.nextInt(i);
            int k = arr[j];
            arr[j] = arr[i];
            arr[i] = k;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
