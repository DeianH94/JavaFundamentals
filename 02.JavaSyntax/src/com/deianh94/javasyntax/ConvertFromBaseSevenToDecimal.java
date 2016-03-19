package com.deianh94.javasyntax;

import java.util.Scanner;

public class ConvertFromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        String num = consoleInput.next();
        int decimal=0;
        int power=0;
        while(num.length()>0) {
            int temp = Integer.parseInt(num.charAt((num.length()) - 1) + "");
            decimal += temp*Math.pow(7, power++);
            num = num.substring(0, num.length()-1);
        }

        System.out.println(decimal);
    }
}
