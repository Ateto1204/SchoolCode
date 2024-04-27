package ntou.cs.java2024;

import java.security.SecureRandom;

public class DeckOfCards {
	
	public static final String[] FACES = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King" };
	public static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
	
	private static final int NUMBER_OF_CARDS = 52; 
	
	private Card[] deck; // array of Card objects
	private int currentCard; // index of next Card to be dealt (0-51)

	// random number generator
	private static final SecureRandom randomNumbers = new SecureRandom();

	// constructor fills deck of Cards
	public DeckOfCards() {

		deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
		currentCard = 0; // first Card dealt will be deck[0]

		// populate deck with Card objects
		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(FACES[count % 13], SUITS[count / 13]);
	}

	// shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
		// next call to method dealCard should start at deck[0] again
		currentCard = 0;

		// for each Card, pick another random Card (0-51) and swap them
		for (int first = 0; first < deck.length; first++) {
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			// swap current Card with randomly selected Card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}

	// deal one Card
	public Card dealCard() {
		// determine whether Cards remain to be dealt
		if (currentCard < deck.length)
			return deck[currentCard++]; // return current Card in array
		else
			return null; // return null to indicate that all Cards were dealt
	}

	public void reset() {
		this.currentCard = 0;
	}

} // end class DeckOfCards
