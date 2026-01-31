package week06DebuggingAndUnitTesting;

public class App {

//2.Create a class called App with a main method
	
	public static void main(String[] args) {

//		System.out.println("A.)Describe a card");// It's asking to describe a card.
//
//		Card card = new Card("Two Hearts", 2);
//		card.describe();
//		System.out.println();
//		System.out.println("B.)Class Deck in Order");// By re-using the describe method, I was able to print out the 52
//														// cards
		Deck deck = new Deck();
		deck.describe();
		System.out.println();
		System.out.println("--Shuffle Deck--");
		deck.shuffle();
		deck.describe();
		System.out.println();
//		System.out.println("--Draw a Card--");
//		//Card drawCard = deck.draw();
//		//drawCard.describe();
//
//		System.out.println();
//		System.out.println("--New Deck--");// 3. this is to instantiate a new deck
		//deck.shuffle();
		// deck.describe();
		//System.out.println();
		//System.out.println("======C.Player=====");
		Player player1 = new Player ("MasterCardPlayer");
		Player player2 = new Player ("VisaCardPlayer"); 
		player1.describe(); 
		player2.describe();
		//deck.shuffle();
//		System.out.println();
//		System.out.println("--Flip--"); 
		//Card player1Card1 =player1.flip(drawCard);
		//System.out.println("--Draw--");commenting this out because I can re-use the method above Card drawCard = deck.draw();
		//System.out.println("--Increment Score--");
		//player1.incrementScore();
		
		//deck.shuffle();
		//deck.describe(); I will comment this out, but this can be print out if needed
			for (int i = 0; i < 26; i++) {
				player1.handDraw(deck);
				player2.handDraw(deck);
			}
		    int game = 26;
		    		//I have to create a variable to use this
			for (int i = 0; i < game ; i++) {//Here is where I compare the value of each card returned by the two player's flip methods, which is also called out to the player Class.
		        System.out.println("Round "+ (i+1));
				Card card1 = player1.flip();
		        System.out.print("Player1 Card is ");
		        card1.describe();
		        Card card2 = player2.flip();
		        System.out.print("Player2 Card is ");
		        card2.describe();

		        int value1 = card1.getValue();//card class has the get method which is what I used here.
		        int value2 = card2.getValue();

		        if (value1 > value2) {
		            player1.incrementScore();//incrementScore method was also called in the Player Class so I can use the method here
		            System.out.println("Player 1 wins the round with a " + card1.getName() + ". Point awarded to Player 1.");//here is to show the points
		       
		        } else if (value2 > value1) {
		            player2.incrementScore();
		            System.out.println("Player 2 wins the round with a " + card2.getName() + ". Point awarded to Player 2.");
		        } else {
		            System.out.println("It's a tie! No point awarded this round.");//It was asked to also print it out if it's a tie
		        }
		        System.out.println("Player 1 Score is " + player1.getScore());
			    System.out.println("Player 2 Score is " + player2.getScore());
			    System.out.println();
		    }

		    // After the loop, compare the final score from each player
		    compareFinalScores(player1, player2);
		}

		public static void compareFinalScores(Player player1, Player player2) {//The constructor to initialized field
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
}

		
	