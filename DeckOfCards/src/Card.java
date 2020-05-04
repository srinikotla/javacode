/*
 * Card.java
 * Class for storing a Card object with face value and suit name
 * 
 * @author Srinivas Kotla
 * @version 1.2
 * @since 04/30/2020
 * 
 */

public class Card {

	private static final String[] faceValues = 
		{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private static final String[] cardSuits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private int cardSuit;
    private int faceValue;
   
    // Create a card with given face value and suit
    public Card(int myValue, int mySuit) {
    	faceValue = myValue;
    	cardSuit = mySuit;
    }
    
    public int getSuit() {
    	return cardSuit;
    }
    
    public int getFaceValue() {
    	return faceValue;
    }
    
    // Named card
    public String toString() {
    	String nameCard = null;
    	try {
    		nameCard = faceValues[faceValue]+" of "+cardSuits[cardSuit];
         } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid card index ( face value: "+faceValue+" and card suit: "+cardSuit+")");
            System.out.println("The valid range for face values is 0 to "+faceValues.length+" and suits is 0 to "+cardSuits.length);
         }
    	return nameCard;
    }
}
