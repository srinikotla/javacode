import java.util.ArrayList;
import java.util.Random;

/**
 * CardDeck.java
 * Create a list of 52 Card objects.
 * Provides operations to shuffle the deck of cards
 * and dealing a single card at a time.
 * 
 * @author Srinivas Kotla
 * @version 1.3
 * @since  04/30/2020
 *
 */
public class CardDeck {
	
	private final int FACEVALUES = 13;
	private final int SUITS = 4;
	ArrayList<Card> myCards = new ArrayList<>();
    
	// Initialize the card deck.
	public CardDeck() {
		
		for( int i = 0; i < FACEVALUES; i++) {
			for (int j = 0; j < SUITS; j++) {
				Card myCard = new Card(i,j);
				myCards.add(myCard);
			}
		}
	}

	// Randomize the order of cards in the current card set.
	public void shuffle() {

		Random getRandom = new Random();
		int swapLocation;
		Card currentCard;
		
		for ( int i = 0; i < myCards.size(); i++ ) {
			swapLocation = getRandom.nextInt(myCards.size());
			currentCard = myCards.get(i);
			myCards.set(i, myCards.get(swapLocation));
			myCards.set(swapLocation, currentCard);
		}
		
	}

	// Deal one card at a time, as long as there are cards remaining in cardDeck
	// Use the next available card in cardDeck and remove the dealt card from list.
	// @return Card - This returns a Card object.
	public Card dealOneCard() {

		if (myCards.isEmpty()) {
			return null;
		} else {
			Card nextCard = myCards.get(0);
			myCards.remove(0);
			return nextCard;
		}
	}
}
