import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create 3 Employee objects
        Employee emp1 = new Employee(1, " Atul Gupta", 500000.0);
        Employee emp2 = new Employee(2, "Snigdha Chakraborti",100000.0);
        Employee emp3 = new Employee(3, "Mayukh Banerjee", 55000.0);

        // Store employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Display details of all employees
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}