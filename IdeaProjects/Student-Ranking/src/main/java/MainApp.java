
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        // Load the Spring context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the StudentService bean
        StudentService studentService = (StudentService)context.getBean("studentService");

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 95));
        students.add(new Student(103, "Bob", 88));
        students.add(new Student(102, "Charlie", 95));
        students.add(new Student(104, "David", 72));

        // Sort and print by ID (default sorting via Comparable)
        System.out.println("--- Students Sorted by ID ---");
        students.sort(null); // Passing null uses the natural ordering (by ID)
        students.forEach(System.out::println);

        System.out.println("\n------------------------------");

        // Use the service bean to print rankings
        studentService.printStudentRankings(students);
    }
}