package homework;


import java.io.Serializable;

public class Course implements Serializable {
    private String nameOfTheCourse;
    private int numOfStudents;

    public Course(String nameOfTheCourse, int numOfStudents) {
        this.setNameOfTheCourse(nameOfTheCourse);
        this.setNumOfStudents(numOfStudents);
    }
    public String getNameOfTheCourse() {
        return nameOfTheCourse;
    }
    public void setNameOfTheCourse(String nameOfTheCourse) {
        if (nameOfTheCourse == null || nameOfTheCourse.length() == 0) {
            throw new IllegalArgumentException(
                    "The name of the course cannot be empty");
        }

        this.nameOfTheCourse = nameOfTheCourse;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        if (numOfStudents < 0) {
            throw new IllegalArgumentException(
                    "The name of the course cannot be empty");
        }

        this.numOfStudents = numOfStudents;
    }
}
