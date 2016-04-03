import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String text = consoleInput.nextLine().toLowerCase();
        String stringToCompare = consoleInput.next();
        consoleInput.close();

        int count = 0;
        int index = text.indexOf(stringToCompare);
        while (index != -1)
        {
            count++;
            index = text.indexOf(stringToCompare, index + 1);
        }

        System.out.println(count);
    }
}
