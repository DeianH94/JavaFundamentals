package com.deianh94.introtojava;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        System.out.println("Input number:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double average = getAverage(a, b, c);
        System.out.printf("Average = %.2f", average);
    }

    private static double getAverage(double a, double b, double c){
        double average = (a + b + c) / 3;
        return average;
    }
}
