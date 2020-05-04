
/*
 * PlayPoker.java
 * 
 * Run a poker game using CardDeck class
 * Get a new deck of cards.
 * Shuffle the deck of cards.
 * Deal a card for 52 times.
 * Ask to deal a card, 53rd time, should not return anything.
 * 
 * @author Srinivas Kotla
 * @version 1.1
 * @since 04/30/2020
 */
public class PlayPoker {

	public static void main(String[] args) {
		
		// Get a new deck of cards
		CardDeck myCardDeck = new CardDeck();
		
		// Shuffle the deck
		myCardDeck.shuffle();	
		
		// Make 52 calls to dealOneCard
		for (int i = 0; i < 52; i++) {
			Card myCard = myCardDeck.dealOneCard();
			System.out.println(myCard);
		}
		
		// Make 53rd call to dealOneCard
		Card myCard = myCardDeck.dealOneCard();
		if ( myCard != null ) System.out.println(myCard);

	}
}
