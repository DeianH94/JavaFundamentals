package com.deianh94.javasyntax;

import java.util.Scanner;

public class ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int decimalNum = consoleInput.nextInt();
        StringBuilder convertedNum = new StringBuilder();

        if (decimalNum > 0) {
            while (decimalNum > 0){
                convertedNum.append(decimalNum % 7);
                decimalNum /= 7;
            }

            convertedNum.reverse();
            System.out.println(convertedNum);
        }
        else {
            System.out.println(0);
        }
    }
}
