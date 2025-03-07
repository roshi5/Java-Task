import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter Employee ID: ");
        int empId = scan.nextInt();
        
        System.out.print("Enter Employee Type (1 for Full-time, 2 for Part-time): ");
        int type = scan.nextInt();

        Employee obj;  // Abstract class reference
        
        if (type == 1) {
            obj = new FullTimeEmployee(name, empId, 50000); // Pass values
        } else {
            System.out.print("Enter Hours Worked: ");
            int hours = scan.nextInt();
            obj = new PartTimeEmployee(name, empId, hours); // Pass values
        }

        obj.calculatesalary();
        obj.showdetails();
        
        scan.close();
    }
}

// Abstract class
abstract class Employee {
    String name;
    int employeeId;
    int salary;

    // Constructor to initialize common attributes
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract void calculatesalary();

    void showdetails() {
        System.out.println("\nExpected output:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass for full-time employees
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, int employeeId, int fixedSalary) {
        super(name, employeeId);
        this.salary = fixedSalary;
    }

    void calculatesalary() {
        // Salary is already set
    }
}

// Subclass for part-time employees
class PartTimeEmployee extends Employee {
    int hoursWorked;

    PartTimeEmployee(String name, int employeeId, int hoursWorked) {
        super(name, employeeId);
        this.hoursWorked = hoursWorked;
    }

    void calculatesalary() {
        this.salary = hoursWorked * 500;  // Calculating salary based on hours worked
    }
}
