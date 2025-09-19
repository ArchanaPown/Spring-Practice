package employee;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    private final Map<String, List<Employee>> employeesByDepartment = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employeesByDepartment.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
    }

    public List<Employee> getEmployeesByDepartment(String dept) {
        // Return a copy to prevent external modification
        return new ArrayList<>(employeesByDepartment.getOrDefault(dept, Collections.emptyList()));
    }

    public Employee getTopPaidEmployee() {
        // Sort employees by salary in descending order and return the first one
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
    }

    public List<Employee> sortEmployeesByName() {
        // Sort employees by name using a lambda expression
        employees.sort(Comparator.comparing(Employee::getName));
        return new ArrayList<>(employees);
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}