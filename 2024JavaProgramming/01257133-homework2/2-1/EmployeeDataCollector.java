package ntou.cs.java2024;

import java.util.ArrayList;
import java.util.Scanner;

import ntou.cs.java2024.CommissionEmployee;
import ntou.cs.java2024.DynamicBonus;
import ntou.cs.java2024.HourlyEmployee;
import ntou.cs.java2024.PieceWorker;
import ntou.cs.java2024.SalariedEmployee;
import ntou.cs.java2024.StaticBonus;

public class EmployeeDataCollector {
	
	private Scanner input = new Scanner(System.in);
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public EmployeeDataCollector () {
		input = new Scanner(System.in);
		list = new ArrayList<Employee>();
	}
	
	public void collectEmployeeData() {
		// TODO (會用到inputEmployeeData)
		while(true) {
			System.out.println("---Earnings Calculation System:");
			System.out.println("1. Salaried Employee");
			System.out.println("2. Hourly Employee");
			System.out.println("3. Commission Employee");
			System.out.println("4. Piece Worker");
			System.out.print("Please input (1~4, -1 to end): ");
			int option = input.nextInt();
			if (option == -1) {
				break;
			}
			Employee employee;
			switch (option) {
				case 1: 
					employee = new SalariedEmployee();
					break;
				case 2: 
					employee = new HourlyEmployee();
					break;
				case 3:
					employee = new CommissionEmployee();
					break;
				case 4:
					employee = new PieceWorker();
					break;
				default: 
					employee = new SalariedEmployee();
			}
			inputEmployeeData(employee);
			System.out.println("");
		}
		System.out.println("Input finished!\n\n---Result: ");
		showList();
	}

	public void inputEmployeeData(Employee employee) {
		employee.inputData(input);
		setBonus(employee);
		list.add(employee);
	}

	public void setBonus(Employee employee) {
		// TODO
		Bonus bonus;
		System.out.print("Please input type of Bonus (1: static, 2: dynamic): ");
		int bonusType = input.nextInt();
		if (bonusType == 2) {
			bonus = new DynamicBonus();
		} else {
			bonus = new StaticBonus();
		}
		employee.setBonus(bonus);
	}

	public void showList() {
		int idx = 1;
		int totalEarning = 0;
		int totalBonus = 0;
		for (Employee employee : list) {
			System.out.println("No. " + idx + ": ");
			System.out.println(employee);
			totalEarning += employee.getEarnings();
			totalBonus += employee.getBonus().getBonus(employee.getEarnings());
			idx++;
		}
		System.out.printf("%nTotal earnings: %,d%n", totalEarning);
		System.out.printf("Total bonus: %,d%n", totalBonus);
	}
}
