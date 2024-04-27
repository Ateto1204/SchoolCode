package ntou.cs.java2024;

public abstract class Weapon implements ATK {

	public static double MAX_VALUE = 255;
	private double offense;
	private double defense;

	public Weapon(double offense, double defense) {
		if ((0 < offense) && (offense < MAX_VALUE))
			this.offense = offense;
		else
			this.offense = 0;

		if ((0 < defense) && (defense < MAX_VALUE))
			this.defense = defense;
		else
			this.defense = 0;
	}

	public double getOffense() {
		return offense;
	}

	public void setOffense(double offense) {
		if ((0 < offense) && (offense < MAX_VALUE))
			this.offense = offense;
		else
			this.offense = 0;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		if ((0 < defense) && (defense < MAX_VALUE))
			this.defense = defense;
		else
			this.defense = 0;
	}

	@Override
	public double defend() {
		return getDefense();
	}

	@Override
	public String toString() {
		return "Weapon [offense=" + offense + ", defense=" + defense + "]";
	}
}
