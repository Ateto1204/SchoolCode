package ntou.cs.java2024;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        if(this.monthlySalary < 0.0) {
            this.monthlySalary = 0.0;
        }
    }

    public void displayYearlySalary() {
        System.out.printf("%s %s; Yearly Salary: %.2f%n", firstName, lastName, monthlySalary*12);
    }

    public void raiseSalary() {
        monthlySalary *= 1.1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
        if(this.monthlySalary < 0.0) {
            this.monthlySalary = 0.0;
        }
    }
}