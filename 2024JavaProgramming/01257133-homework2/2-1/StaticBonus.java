package ntou.cs.java2024;

public class StaticBonus implements Bonus {

	public StaticBonus() {
		
	}

	@Override
	public int getBonus(int salary) {
		return 10000;
	}

}
