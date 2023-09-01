interface Payable {
    double calculateSalary();
}

abstract class Employee implements Payable {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculateSalary() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        super(firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Payable[] employees = new Payable[4];
        employees[0] = new SalariedEmployee("John", "Doe", 800.0);
        employees[1] = new HourlyEmployee("Jane", "Smith", 20.0, 40.0);
        employees[2] = new HourlyEmployee("Alice", "Johnson", 25.0, 30.0);
        employees[3] = new SalariedEmployee("Bob", "Williams", 1000.0);

        System.out.println("Payroll System:");
        for (Payable employee : employees) {
            System.out.println(employee.toString() + " Salary: $" + employee.calculateSalary());
        }
    }
}
