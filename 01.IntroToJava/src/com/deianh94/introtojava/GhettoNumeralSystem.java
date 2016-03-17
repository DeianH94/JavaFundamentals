package com.deianh94.introtojava;

import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        System.out.println("Input number:");
        Scanner input = new Scanner(System.in);
        String number = input.next();
        char[] digits = number.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            switch (digits[i])
            {
                case '0':
                    System.out.print("Gee");
                    break;
                case '1':
                    System.out.print("Bro");
                    break;
                case '2':
                    System.out.print("Zuz");
                    break;
                case '3':
                    System.out.print("Ma");
                    break;
                case '4':
                    System.out.print("Duh");
                    break;
                case '5':
                    System.out.print("Yo");
                    break;
                case '6':
                    System.out.print("Dis");
                    break;
                case '7':
                    System.out.print("Hood");
                    break;
                case '8':
                    System.out.print("Jam");
                    break;
                case '9':
                    System.out.print("Mack");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}
