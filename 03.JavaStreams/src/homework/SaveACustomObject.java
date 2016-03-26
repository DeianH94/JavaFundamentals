package homework;

import java.io.*;

public class SaveACustomObject {
    private static final String FILE_PATH = "resources/course.save";

    public static void main(String[] args) {
        Course firstCourse = new Course("Java", 56);
        Course secondCourse = new Course("Advanced C#", 83);
        Course thirdCourse = new Course("OOP", 68);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(FILE_PATH)))){
            oos.writeObject(firstCourse);
            oos.writeObject(secondCourse);
            oos.writeObject(thirdCourse);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(FILE_PATH)));
            while (true) {
                try {
                    Course course = (Course) ois.readObject();
                    System.out.println("Course: " + course.getNameOfTheCourse());
                    System.out.println("Number of students: " + course.getNumOfStudents());
                } catch (EOFException e) {
                    ois.close();
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File can not be found");
        } catch (IOException e) {
            System.out.println("Error while reading");
        } catch (ClassNotFoundException e) {
            System.out.println("Error while reading");
        }
    }
}
