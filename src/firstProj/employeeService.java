package firstProj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class employeeService {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Sales", 1, "Manager", "Bangalore", "John"),
            new Employee("IT", 2, "Developer", "Bangalore", "Rock"),
            new Employee("Admin", 3, "Assistant", "Hyderabad", "Brock"),
            new Employee("IT", 4, "Developer", "Bangalore", "John"),
            new Employee("Sales", 5, "Executive", "Hyderabad", "Rock"),
            new Employee("Admin", 6, "Manager", "Bangalore", "Brock"),
            new Employee("IT", 7, "Analyst", "Hyderabad", "John"),
            new Employee("Sales", 8, "Executive", "Bangalore", "Brock"),
            new Employee("IT", 9, "Developer", "Hyderabad", "Rock"),
            new Employee("Sales", 10, "Manager", "Bangalore", "John"),
            new Employee("Admin", 11, "Assistant", "Hyderabad", "Brock"),
            new Employee("IT", 12, "Developer", "Bangalore", "John"),
            new Employee("Sales", 13, "Executive", "Bangalore", "Rock"),
            new Employee("Admin", 14, "Manager", "Hyderabad", "Brock"),
            new Employee("IT", 15, "Developer", "Bangalore", "John")
        );

        System.out.println(getAllEmployees("Bangalore", employees));
        System.out.println(getAllEmployees("Bangalore", "IT", employees));
        System.out.println(getAllEmployees("Bangalore", "IT", "John", employees));
    }

    public static List<Employee> getAllEmployees(String city, List<Employee> employees) {
        return employees.stream()
                .filter(emp -> emp.getLocation().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public static List<Employee> getAllEmployees(String city, String dept, List<Employee> employees) {
        return employees.stream()
                .filter(emp -> emp.getLocation().equalsIgnoreCase(city) && emp.getDept().equalsIgnoreCase(dept))
                .collect(Collectors.toList());
    }

    public static List<Employee> getAllEmployees(String city, String dept, String manager, List<Employee> employees) {
        return employees.stream()
                .filter(emp -> emp.getLocation().equalsIgnoreCase(city) && emp.getDept().equalsIgnoreCase(dept) && emp.getName().equalsIgnoreCase(manager))
                .collect(Collectors.toList());
    }
}
