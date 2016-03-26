package homework;

import java.io.*;
import java.util.ArrayList;

public class SaveAnArrayList {
    private static final String FILE_PATH = "resources/doubles.list";

    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(18.7);
        doubleList.add(16.2);
        doubleList.add(5.79);
        doubleList.add(4.6);
        doubleList.add(8.16);
        doubleList.add(19.85);
        doubleList.add(17.2);
        doubleList.add(29.3);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(FILE_PATH)))
             ){
            oos.writeObject(doubleList);
            oos.flush();
            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(FILE_PATH)));
            System.out.println(ois.readObject() + " ");
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        } catch (ClassNotFoundException e) {
            System.out.println("Error while reading");
        }
    }
}
