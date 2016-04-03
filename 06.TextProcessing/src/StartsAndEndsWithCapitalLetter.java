import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String text = consoleInput.nextLine();
        consoleInput.close();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
