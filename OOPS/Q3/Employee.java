public class Employee {
    // Attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary by percentage
    public void raiseSalary(double percentage) {
        double raiseAmount = salary * (percentage / 100);
        salary += raiseAmount;
    }

    // Method to print employee information
    public void printEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Saikiran", "Full Stack Developer", 5000);

        // Print initial employee information
        System.out.println("Initial Employee Information:");
        employee.printEmployeeInfo();

        // Raise salary by 10%
        employee.raiseSalary(10);

        // Print updated employee information
        System.out.println("\nEmployee Information after Salary Raise:");
        employee.printEmployeeInfo();
    }
}
