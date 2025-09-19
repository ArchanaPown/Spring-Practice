package employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Initialize Spring context
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeService employeeService = context.getBean(EmployeeService.class);

            // Add employees
            System.out.println("Adding employees...");
            employeeService.addEmployee(new Employee(1, "Alice", 75000, "HR"));
            employeeService.addEmployee(new Employee(2, "Bob", 120000, "Engineering"));
            employeeService.addEmployee(new Employee(3, "Charlie", 90000, "HR"));
            employeeService.addEmployee(new Employee(4, "David", 150000, "Engineering"));
            employeeService.addEmployee(new Employee(5, "Eve", 60000, "Marketing"));
            employeeService.addEmployee(new Employee(6, "Frank", 110000, "Engineering"));
            System.out.println("Employees added.");

            // Get employees by department
            System.out.println("\nEmployees in Engineering:");
            List<Employee> engineeringEmployees = employeeService.getEmployeesByDepartment("Engineering");
            if (engineeringEmployees.isEmpty()) {
                System.out.println("No employees found in Engineering.");
            } else {
                engineeringEmployees.forEach(System.out::println);
            }

            // Get top-paid employee
            System.out.println("\nTop paid employee:");
            Employee topPaid = employeeService.getTopPaidEmployee();
            if (topPaid != null) {
                System.out.println(topPaid);
            } else {
                System.out.println("No employees found.");
            }

            // Sort employees by name using lambda
            System.out.println("\nEmployees sorted by name:");
            List<Employee> sortedByName = employeeService.sortEmployeesByName();
            sortedByName.forEach(System.out::println);

            // Demonstrate sorting by salary using Comparable
            System.out.println("\nEmployees sorted by salary (using Comparable):");
            List<Employee> allEmployees = employeeService.getAllEmployees();
            Collections.sort(allEmployees);
            allEmployees.forEach(System.out::println);
        }
    }
}