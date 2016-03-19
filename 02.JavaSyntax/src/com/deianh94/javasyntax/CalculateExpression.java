package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        double a = consoleInput.nextDouble();
        double b = consoleInput.nextDouble();
        double c = consoleInput.nextDouble();

        double funkOneBody = ((a * a + b * b) / (a * a - b * b));
        double funkOnePower = (a + b + c)/ Math.sqrt(c);
        double functionOne = Math.pow(funkOneBody, funkOnePower);

        double funkTwoBody = a * a + b * b - c * c * c;
        double funkTwoPower = a - b;
        double functionTwo = Math.pow(funkTwoBody, funkTwoPower);

        double averageABC = (a + b + c) / 3;
        double averageFunctions = (functionOne + functionTwo) / 2;
        double difference = Math.abs(averageABC - averageFunctions);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", functionOne, functionTwo, difference);
    }
}
