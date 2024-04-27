package ntou.cs.java2024;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", "Jones", 2875.00);
        Employee employee2 = new Employee("Susan", "Baker", 3150.75);

        System.out.print("Employee 1: ");
        employee1.displayYearlySalary();
        System.out.print("Employee 2: ");
        employee2.displayYearlySalary();

        System.out.println("Increasing employee salaries by 10%");
        employee1.raiseSalary();
        employee2.raiseSalary();

        System.out.print("Employee 1: ");
        employee1.displayYearlySalary();
        System.out.print("Employee 2: ");
        employee2.displayYearlySalary();
    }
}