package ntou.cs.java2024;

import java.util.ArrayList;

public class Course {
    private final String courseName;
    private final ArrayList<Student> studentList;
    private final int maxStudents;

    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        studentList = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void addStudent(Student student) {
        if(studentList.size() < this.maxStudents) {
            System.out.printf("Student %s is successfully added in course %s%n", 
                            student.getName(), this.courseName);
            studentList.add(student);
        } else {
            System.out.printf("Cannot add student %s, course %s has reached maximum capacity%n", 
                            student.getName(), this.courseName);
        }
    }

    public void removeStudent(Student student) {
        if(studentList.contains(student)) {
            System.out.printf("Student %s successfully removed from course %s%n", 
                            student.getName(), this.courseName);
            studentList.remove(student);
        } else {
            System.out.printf("Student %s is not enrolled in course %s%n", 
                            student.getName(), this.courseName);
        }
    }

    @Override
    public String toString() {
        return "";
    }
}