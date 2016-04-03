import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        // Read the input from the console
        Scanner consoleInput = new Scanner(System.in);
        String text = consoleInput.nextLine();
        consoleInput.close();

        Pattern pattern = Pattern.compile("(\\b\\w+[-._]*\\w+\\b)@(([a-z]+[-]*[a-z]*)\\.)+([a-z]+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
