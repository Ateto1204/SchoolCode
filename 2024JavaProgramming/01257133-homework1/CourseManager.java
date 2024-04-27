package ntou.cs.java2024;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private static final ArrayList<Course> courses = new ArrayList<>();

    public static void addCourse(Course course) {
        if(course.getCourseName() == null) {
            System.out.println("Course name cannot be null or empty");
        } else if(course.getMaxStudents() <= 0) {
            System.out.println("Maximum students must be a positive integer");
        } else {
            System.out.printf("Course %s successfully added%n", course.getCourseName());
            courses.add(course);
        }
    }

    public static Course findCourse(String courseName) {
        Course course = new Course(courseName, 100);
        return course;
    }

    public static void printAllCoursesInfo() {
        for(Course course : courses) {
            System.out.println("Course: " + course.getCourseName());
            System.out.println("Maxinum Students: " + course.getMaxStudents());
            System.out.println("Student Enrolled: ");
            List<Student> students = course.getStudentList();
            for(Student student : students) {
                System.out.println("- " + student.getName());
            }
            System.out.println();
        }
    }
}
