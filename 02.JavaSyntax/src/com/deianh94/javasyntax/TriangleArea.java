package com.deianh94.javasyntax;

import java.util.Locale;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Input the coordinates of the triangle:");
        Scanner consoleInput = new Scanner(System.in);
        int aX = consoleInput.nextInt();
        int aY = consoleInput.nextInt();
        consoleInput.nextLine();
        int bX = consoleInput.nextInt();
        int bY = consoleInput.nextInt();
        consoleInput.nextLine();
        int cX = consoleInput.nextInt();
        int cY = consoleInput.nextInt();
        consoleInput.close();

        int triangleArea = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))/2);

        if (triangleArea != 0){
            System.out.println("Triangle area: " + triangleArea);
        }
        else{
            System.out.println("The given points doesn't form a triangle.\n" + triangleArea);
        }
    }
}
