package ntou.cs.java2024;

public class Card {
	private final String face; // face of card ("Ace", "Deuce", ...)
	private final String suit; // suit of card ("Hearts", "Diamonds", ...)

	// two-argument constructor initializes card's face and suit
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}

	// return String representation of Card
	public String toString() {
		return "You got " + face + " of " + suit + ", " + getPoint() + " points.";
	}

	public int getPoint() {
		int point = -1;
		
		for(int i = 0; i < DeckOfCards.FACES.length; i++) {
			if(this.face.equals(DeckOfCards.FACES[i])) {
				if(i == 0) point = 20;
				else point = i + 1;
			}
		}
		
		return point;
	}

} // end class Card

