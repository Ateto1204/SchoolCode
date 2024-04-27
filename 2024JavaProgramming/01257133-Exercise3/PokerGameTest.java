package ntou.cs.java2024;

import java.security.SecureRandom;
import java.util.Scanner;

public class PokerGameTest {
	public static void main(String[] args) {
		PokerGame game = new PokerGame();
		Scanner input = new Scanner(System.in);
		boolean isContinue = true;
		boolean first = true;
		
		while(isContinue) {
			if(first) first = false;
			else System.out.print("\n");
			System.out.print("Please input your choice (0: quit, 1: play, 2: restart, 3: repeat): ");
			int choice = input.nextInt();
			switch (choice) {
				case 0: 
					System.out.println("Game over!!");
					isContinue = false;
					break;
				case 1: 
					game.dealFiveCards();
					break;
				case 2: 
					game = new PokerGame(game);
					game.dealFiveCards();
					break;
				case 3: 
					game.getMyDeckOfCards().reset();
					game.dealFiveCards();
					break;
				default: 
					System.out.println("Illegal operation");
			}
		}
	}
} // end class PokerGameTest
