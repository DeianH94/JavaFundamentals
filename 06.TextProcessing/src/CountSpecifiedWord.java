import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] text = consoleInput.nextLine().toLowerCase().split("\\W+");
        String wordToFind = consoleInput.next().toLowerCase();
        consoleInput.close();

        int count = 0;
        for (String word : text) {
            if (word.equals(wordToFind)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
