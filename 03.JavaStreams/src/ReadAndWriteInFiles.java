import java.io.*;

public class ReadAndWriteInFiles {
    private static final String FILE_PATH = "C:\\Users\\Admin\\Documents\\GitHub\\JavaFundamentals\\03.JavaStreams\\users.txt";
    private static final String SAVE_PATH = "C:\\Users\\Admin\\Documents\\GitHub\\JavaFundamentals\\03.JavaStreams\\total-time.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        File outputFile = new File(SAVE_PATH);

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile, true),true)){

            String line = reader.readLine();
            while (line != null){
                String[] lineArgs = line.split(" ");
                String userName = lineArgs[0];
                int totalMinutes = 0;

                for (int i = 1; i < lineArgs.length; i++) {
                    String[] loggedTime = lineArgs[i].split(":");
                    int hours = Integer.parseInt(loggedTime[0]);
                    int minutes = Integer.parseInt(loggedTime[1]);
                    totalMinutes += (hours * 60) + minutes;
                }

                String output = userName
                        + " (" + totalMinutes / 24 / 60 + " days, "
                        + totalMinutes / 60 % 24 + " hours, "
                        + totalMinutes % 60 + " minutes" + ")";
                writer.println(output);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        }
    }
}
