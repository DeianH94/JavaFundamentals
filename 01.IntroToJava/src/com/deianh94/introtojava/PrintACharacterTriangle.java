package com.deianh94.introtojava;
import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        System.out.println("Input the size of the triangle:");
        Scanner input = new Scanner(System.in);
        int triangleSize = input.nextInt();

        for (int i = 0; i < triangleSize; i++) {
            for (char j = 'a'; j <= 'a' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = triangleSize - 2; i >= 0; i--) {
            for (char j = 'a'; j <= 'a' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
