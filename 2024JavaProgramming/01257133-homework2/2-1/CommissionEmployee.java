package ntou.cs.java2024;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
    private double commisionRate = -1;
    private int grossSales = -1;

    public CommissionEmployee() {

    }
    
    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input commission rate: ");
        commisionRate = input.nextDouble();
        System.out.print("Please input gross sales: ");
        grossSales = input.nextInt();
    }

    @Override
    public int getEarnings() {
        int salary = (int)(commisionRate * grossSales);
        return salary;
    }

    @Override
    public String toString() {
        Bonus bonus = getBonus();
        int salary = (int)(commisionRate * grossSales);
        return String.format("Commision Employee => weekly salary: %.2f, working weeks: %,d, calculated earnings: %,d, bonus: %,d", 
                commisionRate, grossSales, getEarnings(), bonus.getBonus(salary));
    }

    public int getThisBonus() {
        Bonus bonus = getBonus();
        int salary = (int)(commisionRate * grossSales);
        return bonus.getBonus(salary);
    }
}
