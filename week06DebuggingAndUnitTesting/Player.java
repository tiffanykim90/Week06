package week06DebuggingAndUnitTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Player {
	
		List<Card> hand = new ArrayList<Card>();//the array will be coming from the card class, so here I am calling out the Class Card 
											//and naming the variable hand
			Integer score = 0;//instance field
			String name;
			private Object player1;
			private Object player2;

		Player(String name) {//I have to call this out here for the Main App method
			this.name = name;
			this.hand = new ArrayList<Card>();
			this.score = 1;
			this.player1 = player1;
			this.player2 = player2;
		}
		public String toString() {
			return hand + " of "+ name;
		}

		public void shuffle() {//B.2.a where it tells to shuffle the deck which is the variable hand
	        Collections.shuffle(hand);
	        System.out.println("Deck shuffled.");
	    }

		public Card dealCard() {
			//System.out.println("Player drawn a card: "+ hand.remove(0));
	        return hand.remove(0);
	        
	    }

		//@SuppressWarnings("unchecked")
		//public Card flip(Object cards) {//B.2. flip (removes and returns the top card of the Hand)
			//return hand.remove(0);
		//}
		public void handDraw(Deck deck) {//B.3. draw (takes a Deck as an argument and calls the draw method on the deck,
			                             // adding the returned Card to the hand field)
			Card drawnCard = deck.draw();//Calling out the draw method on the deck
			hand.add(drawnCard);//this is supposed to return the card to the hand
		}
		public void Players() {//4.Initialize the score to 0
			this.score = 0;
		}
		public void describe1() {//I have to call this out for the main App, so I can instantiate the player
			
		}
		
		//ii.Methods 1. describe (prints out information about the player and calls the describe
		 			//method for each card in the Hand List)

		public void describe() {
			System.out.println("Player Name:" + this.name);
			for (Card card : hand) {
				((Player) hand).describe1();
			}
		}
		public List<Card> getHand() {
			return hand;
		}

		public void setHand(List<Card> hand) {
			this.hand = hand;
		}

		public Integer getScore() {//4.this is to get the players score
			return score;
		}

		public void setScore(Integer score) {
			this.score = score+1;//4. this is the increment the score by 1
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		
}
		public void incrementScore() {//this method is for the App 
			score++;
		}
		public String getValue() {//this method if for the App to get the score value
			return getValue();
		}
		public Card flip() {//this is to call out the App flip method
			
			return dealCard();
		}

	

}//end of class player
