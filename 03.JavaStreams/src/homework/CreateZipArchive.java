package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
    private static final String FILE_PATH_ONE = "resources/words.txt";
    private static final String FILE_PATH_TWO = "resources/count-chars.txt";
    private static final String FILE_PATH_THREE = "resources/lines.txt";
    private static final String SAVE_PATH = "resources/text-files.zip";

    public static void main(String[] args) {
        String[] savePaths = new String[3];
        savePaths[0] = FILE_PATH_ONE;
        savePaths[1] = FILE_PATH_TWO;
        savePaths[2] = FILE_PATH_THREE;

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(SAVE_PATH))){
            for (int i = 0; i < savePaths.length; i++) {
                try (FileInputStream writer = new FileInputStream(savePaths[i])){
                    zos.putNextEntry(new ZipEntry(savePaths[i]));
                    int length = writer.read();
                    while (length != -1){
                        zos.write(length);
                        length = writer.read();
                    }

                    zos.closeEntry();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        }
    }
}
