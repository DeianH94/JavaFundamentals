package com.deianh94.introtojava;
import java.util.Scanner;

public class SumNumbersFromOneToN {
    public static void main(String[] args) {
        System.out.println("Input N:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
