package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Scanner;

public class ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner consoleInput = new Scanner(System.in);
        int decimalNum = consoleInput.nextInt();
        consoleInput.close();
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
