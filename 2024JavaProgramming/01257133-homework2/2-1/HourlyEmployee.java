package ntou.cs.java2024;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
    private int wage = -1;
    private int hours = -1;

    public HourlyEmployee() {

    }
    
    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input wage: ");
        wage = input.nextInt();
        System.out.print("Please input hours: ");
        hours = input.nextInt();
    }

    @Override
    public int getEarnings() {
        Bonus bonus = getBonus();
        int salary = 0;
        if (hours >= 40) {
            salary += wage * 40;
            salary += wage * (hours-40) * 3 / 2;
        } else {
            salary += wage * hours;
        }

        return salary;
    }

    @Override
    public String toString() {
        Bonus bonus = getBonus();
        int salary = wage * hours;
        return String.format("Hourly Employee => hourly salary: %,d, hours: %,d, calculated earnings: %,d, bonus: %,d", 
                wage, hours, getEarnings(), bonus.getBonus(getEarnings()));
    }

    public int getThisBonus() {
        Bonus bonus = getBonus();
        int salary = wage * hours;
        return bonus.getBonus(salary);
    }
}
