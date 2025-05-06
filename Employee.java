public class Employee {
    String name;
    int emp_id;
    double salary;

    // Removed dob from constructor since it's unused
    Employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    void displaydetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("John Doe", 101, 50000.0); // Removed dob
        e.displaydetails(); // Removed e.display();
    }
}
