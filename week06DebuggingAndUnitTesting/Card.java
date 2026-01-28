package week06DebuggingAndUnitTesting;

public class Card {

	
	String name;
	Integer value;
	/*
	 * 1. Create the following classes: a. Card i. Fields 1. value (contains a value
	 * from 2-14 representing cards 2-Ace) 2. name (e.g. Ace of Diamonds, or Two of
	 * Hearts)
	 */
	//when we instantiate the class, we also have to define the constructor to avoid the error.
		Card(String name, Integer value){
			this.name = name;
			this.value = value; //the.this references the keyword instance of the class.In this case is the cards	
		}

		public Card(String name2, String value2, int count) {//this is the constructor for the for loop in the deck class
			this.name = value2 + " of "  + name2;//along with the constructor we also have to call out the variables in the for loop
			this.value = count;
		}

		public Card(String string) {//2. Calling this out for the App
		}

		public String getName() {//1.)ii. Methods 1. Getters and Setters 2. describe (prints out information about a card
			
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getValue() {
			return value;
		}
		public void setValue(Integer value) {
			this.value = value;
		}
	
		public void describe() {
			System.out.println(this.name + "="+ this.value);
		
	}
		public void shuffle() {
			System.out.println(this.name);
		}
		
		public static boolean isempty() {
			return true;
		}
		

		
}
		
