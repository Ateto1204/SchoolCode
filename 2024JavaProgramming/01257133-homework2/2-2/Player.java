package ntou.cs.java2024;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public static final double MAX_HP = 1999;
	public static final int DEFAULT_HP = 200;
	public static final int DEFAULT_ATK = 50;

	private final String name;
	private double hp;
	private ArrayList<ATK> equipment = new ArrayList<ATK>();

	public Player(String name) {
		// TODO
		this.hp = DEFAULT_HP;
		this.name = name;
		Weapon demo = new NormalWeapon(DEFAULT_ATK, 0);
		equipment.add(demo);
	}

	public Player(String name, double hp) {
		// TODO
		this(name);
		this.hp = hp;
	}

	public Player(String name, double hp, ArrayList<ATK> equipments) {
		this.name = name;
		setHp(hp);
		this.equipment = equipments;
	}

	public String getName() {
		return name;
	}

	public double getHp() {
		return hp;
	}

	public final void setHp(double hp) {
		if ((0 < hp) && (hp < MAX_HP))
			this.hp = hp;
		else
			this.hp = 0;
	}

	public ArrayList<ATK> getEquipments() {
		return equipment;
	}

	public void setEquipments(ArrayList<ATK> equipments) {
		this.equipment = equipments;
	}

	public double attack(Player enemy, double defenseRate) {
		// TODO
		System.out.println(name + "攻擊前：");
		System.out.println("HP of " + enemy.getName() + ": " + enemy.getHp());
		System.out.println(name + "攻擊：");
		double totalAtk = 0;
		for (ATK equ : equipment) {
			totalAtk += equ.attack();
		}

		defend(enemy, defenseRate, totalAtk);

		return totalAtk;
	}

	public double defend(Player enemy, double defenseRate, double totalAtk) {
		// TODO
		List<ATK> enenmyEqu = enemy.getEquipments();
		System.out.println(enemy.getName() + "防禦：");
		double totalDef = 0;
		for (ATK equ : enenmyEqu) {
			totalDef += equ.defend();
		}
		totalDef *= defenseRate;
		if (defenseRate == 2) {
			System.out.printf("防禦力變為 %.1f 倍%n", defenseRate);
		}
		double enemyHp = enemy.getHp();
		enemy.setHp(enemyHp - (totalAtk - totalDef));
		System.out.println(name + "攻擊後：");
		System.out.println("HP of " + enemy.getName() + ": " + enemy.getHp());
		return totalDef;
	}

	@Override
	public String toString() {
		return "Player [hp=" + hp + ", equipments=" + equipment + "]";
	}
}
