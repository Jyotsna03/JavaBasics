public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor to initialize the Employee object
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Assuming monthly salary
    }

    // Method to update the salary
    public void updateSalary(double newSalary) {
        salary = newSalary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", "Software Engineer", 5000.0);

        // Display employee information
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Monthly Salary: $" + emp.getSalary());
        System.out.println("Annual Salary: $" + emp.calculateAnnualSalary());

        // Update the salary
        emp.updateSalary(5500.0);

        // Display updated salary
        System.out.println("\nUpdated Monthly Salary: $" + emp.getSalary());
        System.out.println("Updated Annual Salary: $" + emp.calculateAnnualSalary());;}
}