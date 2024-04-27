package ntou.cs.java2024;

import java.security.SecureRandom;

public class Pet implements ATK {
	private int maxAttack;
	private SecureRandom random = new SecureRandom();

	public Pet(int maxAttack) {
		if (maxAttack > 0) {
			this.maxAttack = maxAttack;
		}
	}

	@Override
	public double attack() {
		int atk = random.nextInt(maxAttack-1) + 1;
		System.out.printf("[Pet可造成 %d 點的傷害]%n", atk);
		return atk;
	}

	@Override
	public double defend() {
        int def = 0;
        System.out.printf("[Pet可抵擋 %d 點的傷害]%n", def);
        return def;
	}
}
