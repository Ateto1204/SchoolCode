package ntou.cs.java2024;

public class DynamicBonus implements Bonus {

	public DynamicBonus() {
		
	}

	@Override
	public int getBonus(int salary) {
		return salary * 10 / 100;
	}

}
