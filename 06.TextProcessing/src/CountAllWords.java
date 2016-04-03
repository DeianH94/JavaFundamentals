import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String[] text = consoleInput.nextLine().split("\\W+");
        consoleInput.close();

        System.out.println(text.length);
    }
}
