package ntou.cs.java2024;

import java.util.Scanner;

public class PieceWorker extends Employee {
    private int wage = -1;
    private int piece = -1;

    public PieceWorker() {

    }
    
    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input wage: ");
        wage = input.nextInt();
        System.out.print("Please input piece: ");
        piece = input.nextInt();
    }

    @Override
    public int getEarnings() {
        int salary = wage * piece;
        return salary;
    }

    @Override
    public String toString() {
        Bonus bonus = getBonus();
        int salary = wage * piece;
        return String.format("Piece Worker => wage: %,d, piece: %,d, calculated earnings: %,d, bonus: %,d", 
                wage, piece, getEarnings(), bonus.getBonus(salary));
    }

    public int getThisBonus() {
        Bonus bonus = getBonus();
        int salary = wage * piece;
        return bonus.getBonus(salary);
    }
}
