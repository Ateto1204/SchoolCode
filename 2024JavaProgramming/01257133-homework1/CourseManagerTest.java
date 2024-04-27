package ntou.cs.java2024;

public class CourseManagerTest {
    public static void main(String[] args) {
        try {
            Course databaseCourse = new Course(null, 30); // Attempt to create course with null name
            CourseManager.addCourse(databaseCourse);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Course dataStructureCourse = new Course("Data Structures", -5); // Attempt to create course with negative maximum students}
            CourseManager.addCourse(dataStructureCourse);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Create courses
        Course javaProgramming = new Course("Java Programming", 60);
        Course webProgramming = new Course("Web Programming", 70);
        Course translationAndGambling = new Course("Translation and Gambling", 2);

        // Add courses to school
        CourseManager.addCourse(javaProgramming);
        CourseManager.addCourse(webProgramming);
        CourseManager.addCourse(translationAndGambling);

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");
        Student student4 = new Student("David");
        Student student5 = new Student("Eason");
        Student student6 = new Student("Frank");
        Student student7 = new Student("Grace");
        Student student8 = new Student("Henry");
        Student student9 = new Student("Ippei");
        Student student10 = new Student("Shohei");

        // Add students to courses
        javaProgramming.addStudent(student1);
        javaProgramming.addStudent(student2);
        javaProgramming.addStudent(student3);
        javaProgramming.addStudent(student4);
        javaProgramming.addStudent(student5);

        webProgramming.addStudent(student6);
        webProgramming.addStudent(student7);
        webProgramming.addStudent(student8);

        translationAndGambling.addStudent(student9);
        translationAndGambling.addStudent(student10);

        Course javaCourseAlias = CourseManager.findCourse("Java Programming");
        System.out.println("\nFound Course:");
        System.out.println(javaCourseAlias);

        // Print all courses information
        CourseManager.printAllCoursesInfo();
    }
}
