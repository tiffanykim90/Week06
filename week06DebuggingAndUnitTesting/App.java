package week06DebuggingAndUnitTesting;

public class App {

//2.Create a class called App with a main method
	
	public static void main(String[] args) {

		System.out.println("A.)Describe a card");// It's asking to describe a card.

		Card card = new Card("Two Hearts", 2);
		card.describe();
		System.out.println();
		System.out.println("B.)Class Deck in Order");// By re-using the describe method, I was able to print out the 52
														// cards
		Deck deck = new Deck();
		// deck.describe();
		System.out.println();
		System.out.println("--Shuffle Deck--");
		deck.shuffle();
		// deck.describe();
		System.out.println();
		System.out.println("--Draw a Card--");
		Card drawCard = deck.draw();
		drawCard.describe();

		System.out.println();
		System.out.println("--New Deck--");// 3. this is to instantiate a new deck
		deck.shuffle();
		// deck.describe();
		System.out.println();
		System.out.println("======C.Player=====");
		Player player1 = new Player ("MasterCardPlayer");
		Player player2 = new Player ("VisaCardPlayer"); 
		((Player) player1).describe(); 
		((Player) player2).describe();
		deck.shuffle();
		System.out.println();
		System.out.println("--Flip--"); 
		//Card player1Card1 =player1.flip(drawCard);
		//System.out.println("--Draw--");commenting this out because I can re-use the method above Card drawCard = deck.draw();
		System.out.println("--Increment Score--");
		player1.incrementScore();
		System.out.println();
		System.out.println("--2. Create a class called App with a main method.");
		deck.shuffle();
		//deck.describe(); I will comment this out, but this can be print out if needed
		
		    int game = 0
		    		;//I have to create a variable to use this
			for (int i = 0; i < game ; i++) {//Here is where I compare the value of each card returned by the two player's flip methods, which is also called out to the player Class.
		        Card card1 = player1.flip();
		        Card card2 = player2.flip();

		        int value1 = card1.getValue();//card class has the get method which is what I used here.
		        int value2 = card2.getValue();

		        if (value1 > value2) {
		            player1.incrementScore();//incrementScore method was also called in the Player Class so I can use the method here
		            System.out.println("Player 1 wins the round with a " + card1.toString() + ". Point awarded to Player 1.");//here is to show the points
		        } else if (value2 > value1) {
		            player2.incrementScore();
		            System.out.println("Player 2 wins the round with a " + card2.toString() + ". Point awarded to Player 2.");
		        } else {
		            System.out.println("It's a tie! No point awarded this round.");//It was asked to also print it out if it's a tie
		        }
		    }

		    // After the loop, compare the final score from each player
		    compareFinalScores(player1, player2);
		}

		public static void compareFinalScores(Player player1, Player player2) {
		    int score1 = player1.getScore();
		    int score2 = player2.getScore();

		    System.out.println("\nFinal Scores:");
		    System.out.println("Player 1: " + score1);
		    System.out.println("Player 2: " + score2);

		    if (score1 > score2) {
		        System.out.println("Player 1 is the overall winner!");
		    } else if (score2 > score1) {
		        System.out.println("Player 2 is the overall winner!");
		    } else {
		        System.out.println("The game ends in a tie!");
		    }


		
		
	}
//end of main

	private int i;

//----Start of 2. method, 

	public App(String[] args, Card drawnCard, Card player1Card, Card player2Card, Card player3Card, Card player4Card, Player player4) {// 2.a here I call out the Class Deck and the variable to instantiate, and I
								// used the .shuffle to shuffle the cards
						// I also instantiate the 2 players here
		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player ("MasterCardPlayer");
		Player player2 = new Player ("VisaCardPlayer"); 
		
		 for ( int i = 0;i < 52; i++) {//b. Using the traditional for loop,I iterate 52 times calling the Draw method on 
			 							//the other player each iteration using the deck that has been istantiated
		 }
			  if (i % 2 == 0) { player1.getHand().add(drawnCard);
			  }else{ 
			 player2.getHand().add(drawnCard); 
			 }
			  for ( int x = 0; x < 26; x++) {//c. here is where I instantiate the card 26 times
				  //Card drawnCard= deck.draw();
				  player1.flip(drawnCard);
				  player2.flip(drawnCard);
				  }
				
	}// app

	// I used the for loop to instantiate the 52 cards and calling out the player in
	// each iteration.

	/*
	 
	/*
	 * 2. Create a class called App with a main method.
	 * 
	 * a. Instantiate a Deck and two Players, call the shuffle method on the deck.
	 * 
	 * b. Using a traditional for loop, iterate 52 times calling the Draw method on
	 * the other player each iteration using the Deck you instantiated.
	 * 
	 * c. Using a traditional for loop, iterate 26 times and call the flip method
	 * for each player.
	 * 
	 * Compare the value of each card returned by the two player’s flip methods.
	 * Call the incrementScore method on the player whose card has the higher value.
	 * Print a message to say which player received a point. Note: If the values are
	 * equal (it is a tie), print a message saying that no point was awarded. d.
	 * After the loop, compare the final score from each player.
	 * 
	 * e. Print the final score of each player and either “Player 1”, “Player 2”, or
	 * “Draw” depending on which score is higher or if they are both the same.
	 * 
	 * 
	 * 
	 * 3. Tips: Printing out information throughout the game adds value including
	 * easier debugging as you progress and a better user experience.
	 * 
	 * a. Using the Card describe() method when each card is flipped illustrates the
	 * game play.
	 * 
	 * b. Printing the winner of each turn adds interest -- or a message indicating
	 * a tie.
	 * 
	 * c. Printing the updated score after each turn shows game progression.
	 * 
	 * d. At the end of the game: print the final score of each player and the
	 * winner’s name or “Draw” if the result is a tie.
	 */




}// end of App
