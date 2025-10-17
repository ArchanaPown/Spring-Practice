package UniversityManagement;
import java.util.*;
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Details");
        String input = scanner.nextLine();

        try {
            Student student = Student.validateStudentDetails(input);
            System.out.println("Student Details");
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Age: " + student.getAge());
        } catch (InvalidStudentException e) {
            System.out.println(e.getMessage());
        }
    }
}
