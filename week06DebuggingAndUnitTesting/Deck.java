package week06DebuggingAndUnitTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	/* 
	 * 3. In the constructor, when a new Deck is instantiated, the Cards field
	 * should be populated with the standard 52 cards.
	 */
public class Deck {
	
//i.Fields
	String name;
	String value;
    //ii.Methods
	List<Card> cards = new ArrayList<Card>();

	Deck(){ //the constructor does not need a parameter since we need all 52 cards
		String[] names = {"Clubs", "Diamonds","Hearts","Spades"};
		String[] values = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
				
		for (String name : names){//I used an enhance for loops to go thru each array to create a card
			int count = 2;//I started here at 2 since the ranks starts at 2
			for (String value : values) {
				Card card = new Card(name,value,count) ; //we want to instantiate a new card for each card we want to create, 
				cards.add(card);//Here is where I instantiate the new card	    //so I will pass in the suit,ranks and the count
				count++;//then here is when I increment the count		
			}
		
		}
	}//end of deck
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public void describe() {
		for (Card card : this.cards) {
			card.describe();		
		}
	}
	public void shuffle() {//1.shuffle cards and 3. will populate a new deck every time we shuffle
		Collections.shuffle(this.cards);	//this can be re-use every time we want a new deck 
	}
	public Card draw() {
		Card card = this.cards.remove(0);
			return card;
		
	}

	public void App() {		
	}
	
	

 }//end of class deck


	            
