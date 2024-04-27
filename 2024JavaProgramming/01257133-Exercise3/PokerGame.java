package ntou.cs.java2024;

public class PokerGame {
	private DeckOfCards myDeckOfCards;

	public PokerGame() {
		myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
	}

	public PokerGame(PokerGame game) {
		myDeckOfCards = game.getMyDeckOfCards();
		myDeckOfCards.reset();
		myDeckOfCards.shuffle();
	}

	public DeckOfCards getMyDeckOfCards() {
		return this.myDeckOfCards;
	}
	
	public void dealFiveCards() {
		int totalPoints = 0;
		for(int i = 0; i < 5; i++) {
			try {
				Card card = myDeckOfCards.dealCard();
				if(card != null) System.out.println(card);
				totalPoints += card.getPoint();
			} catch (NullPointerException exception) {
				System.out.println("No card can be dealt, please restart the game!");
				return ;
			}
		}
		System.out.println("Your total points are " + totalPoints);
	}

} // end class PokerGame
