package ntou.cs.java2024;

import java.util.Random;

public class Game {
	public static void main(String[] args) {
		// Code here
		Player player1 = new Player();
		Long player1Hp = (long)(Math.random() * 1_000_000_001L) + 9_000_000_000L;
		Long player1AttackPoints = (long)(Math.random() * 100_000_001L) + 100_000_000L;
		player1.setHp(player1Hp);
		player1.setAttackPoints(player1AttackPoints);
		System.out.printf("Player1 -> HP: %,d, attack points: %,d%n", player1.getHp(), player1.getAttackPoints());
		// Code here
		Player player2 = new Player();
		Long player2Hp = (long)(Math.random() * 1_000_000_001L) + 9_000_000_000L;
		Long player2AttackPoints = (long)(Math.random() * 100_000_001L) + 100_000_000L;
		player2.setHp(player2Hp);
		player2.setAttackPoints(player2AttackPoints);
		System.out.printf("Player2 -> HP: %,d, attack points: %,d%n", player2.getHp(), player2.getAttackPoints());

		while (true) {
			player1.attack(player2);
			System.out.printf("Player1 attacks! Player2's HP becomes %,d%n", player2.getHp());

			// Code here to determine the winner and exit while
			if(player2.getHp() == 0L) {
				System.out.println("Player1 wins!");
				break;
			}

			player2.attack(player1);
			System.out.printf("Player2 attacks! Player1's HP becomes %,d%n", player1.getHp());
			if(player1.getHp() == 0L) {
				System.out.println("Player2 wins!");
				break;
			}

			// Code here to determine the winner and exit while
		}
	}
}

class Player {
	private Long hp;
	private Long attackPoints;

	public Player() {
		this.hp = 0L;
		this.attackPoints = 0L;
	}

	public void setHp(Long newHp) {
		if(newHp < 0) this.hp = 0L;
		else this.hp = newHp;
	}

	public void setAttackPoints(Long newAttackPoints) {
		this.attackPoints = newAttackPoints;
	}

	public Long getHp() {
		return this.hp;
	}

	public Long getAttackPoints() {
		return this.attackPoints;
	}

	public void attack(Player enemy) {
		enemy.beAttacked(this.attackPoints);
	}

	public void beAttacked(Long attackPoints) {
		this.hp -= attackPoints;
		if(this.hp < 0) this.hp = 0L;
	}
}