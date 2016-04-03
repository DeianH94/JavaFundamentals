package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArray {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] elements = consoleInput.nextLine().split(" ");
        consoleInput.close();

        List<Integer> numbers = Arrays.stream(elements)
                .filter(FilterArray :: isNumber)
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(Integer :: intValue).sum();
        int anotherSum = numbers.stream().collect(Collectors.summingInt(Integer :: intValue));
        int sumReduce = numbers.stream().reduce((x, y) -> x + y).get();

        System.out.println(sum);
        System.out.println(anotherSum);
        System.out.println(sumReduce);
    }

    private static boolean isNumber (String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }
}
