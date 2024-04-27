package ntou.cs.java2024;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
    private int weeklySalary = -1;
    private int weeks = -1;

    public SalariedEmployee() {

    }
    
    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input weekly salary: ");
        weeklySalary = input.nextInt();
        System.out.print("Please input working weeks: ");
        weeks = input.nextInt();
    }

    @Override
    public int getEarnings() {
        int salary = weeklySalary * weeks;
        return salary;
    }

    @Override
    public String toString() {
        Bonus bonus = getBonus();
        int salary = weeklySalary * weeks;
        return String.format("Salaried Employee => weekly salary: %,d, working weeks: %,d, calculated earnings: %,d, bonus: %,d", 
                weeklySalary, weeks, getEarnings(), bonus.getBonus(salary));
    }

    public int getThisBonus() {
        Bonus bonus = getBonus();
        int salary = weeklySalary * weeks;
        return bonus.getBonus(salary);
    }
}
