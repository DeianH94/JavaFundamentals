package homework;

import java.io.*;

public class Copy_jpgFile {
    private static final String FILE_PATH = "resources/picture.jpg";
    private static final String SAVE_PATH = "resources/my-copied-picture.jpg";

    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream(FILE_PATH);
             FileOutputStream writer = new FileOutputStream(SAVE_PATH)) {
            byte[] buffer = new byte[957];
            int len = reader.read(buffer);

            while (len != -1) {
                writer.write(buffer, 0, len);
                len = reader.read(buffer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        }
    }
}
