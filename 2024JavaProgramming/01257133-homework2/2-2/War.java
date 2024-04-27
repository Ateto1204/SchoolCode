package ntou.cs.java2024;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class War {
	public static final int ATTACK = 1;
	public static final int DEFEND = 2;
	public static final int END = 3;

	private Player user;
	private Player npc;
	private final SecureRandom random = new SecureRandom();

	public War(Player user, Player npc) {
		this.user = user;
		this.npc = npc;
	}

	public void battle() {

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("\n請選擇: 1.攻擊 2.防禦 3.結束: ");
			int action = -1;
			
			try {
				action = input.nextInt();
			} catch (InputMismatchException e) {
				input.nextLine();
			}
			
			System.out.println();

			if (action == ATTACK) {
				attack(user, npc, 1);
				if (determineVictory(user, npc)) {
					input.close();
					return;
				}
				System.out.println();				
				attack(npc, user, 1);
				if (determineVictory(user, npc)) {
					input.close();
					return;
				}
			} else if (action == DEFEND) {
				attack(npc, user, 2);
				if (random.nextInt(3) == 1) {
					System.out.println();
					selfHeal(user);
				}
				if (determineVictory(user, npc)) {
					input.close();
					return;
				}
			} else if (action == END) {
				System.out.println("遊戲結束!");
				input.close();
				return;
			} else {
				System.out.println("您輸入無效指令");
				continue;
			}
		}
	}

	public void attack(Player player1, Player player2, double defenseRate) {
		// TODO
		player1.attack(player2, defenseRate);
	}

	public void selfHeal(Player player) {
		// TODO
		System.out.println(player.getName() + "自我療癒了！");
		int playerHp = (int)player.getHp();
		int headling = random.nextInt(150-10) + 10;
		player.setHp(playerHp+headling);
		System.out.printf("自我療癒後：HP of %s: %.1f%n", 
						player.getName(), 
						player.getHp());
	}
	
	public boolean determineVictory (Player user, Player npc) {
		// TODO
		if (user.getHp() <= 0) {
			System.out.printf("%n%s被%s擊倒了！%n", user.getName(), npc.getName());
			return true;
		}
		if (npc.getHp() <= 0) {
			System.out.printf("%n%s擊倒了%s！%n", npc.getName(), user.getName());
			return true;
		}
		return false;
	}
}
