package ntou.cs.java2024;

/*
 * Compile: javac -d . -encoding utf8 *.java
 * Run: java ntou.cs.java2024.WarTest
 */

import java.security.SecureRandom;
import java.util.ArrayList;

public class WarTest {
	public static void main(String args[]) {
		SecureRandom random = new SecureRandom();

		int playerHP = 150 + random.nextInt(50);
		int normalATK = 20 + random.nextInt(40);
		int doubleATK = 25 + random.nextInt(35);
		int powerATK = 30 + random.nextInt(30);
		int pokemonATK = 50 + random.nextInt(50);

		System.out.printf("您的初始設定：\n玩家HP：%s，配戴一般武器攻擊力：%s、加倍武器攻擊力：%s、強力武器攻擊力：%s，Pet攻擊力：%s\n", playerHP, normalATK,
				doubleATK, powerATK, pokemonATK);

		ArrayList<ATK> equipment = new ArrayList<ATK>();
		equipment.add(new NormalWeapon(normalATK, normalATK / 8));
		equipment.add(new DoubleWeapon(doubleATK, normalATK / 8));
		equipment.add(new PowerWeapon(powerATK, normalATK / 8));
		equipment.add(new Pet(pokemonATK));

		Player user = new Player("USER", playerHP, equipment);

		Player npc = new Player("NPC", 1500 - playerHP);
		
		War war = new War(user, npc);
		war.battle();
	}
}
