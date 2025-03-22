public class Employee
{
        // Attributes
        private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String name;
        private double salary;

        // Constructor
        public Employee(int id, String name, double salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        // Method to display employee details
        public void displayDetails()
        {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
            System.out.println(); // For better readability
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
