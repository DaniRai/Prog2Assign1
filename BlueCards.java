import java.util.ArrayList;	//importing ArrayList method 
import java.util.Random;	//importing random method
import java.util.Collections;	//importing collections method

public class BlueCards<Card> {	//declaration of BlueCard class
	private Random chanceMaker;	//instance field for each object created in class
	private static ArrayList<BlueCard>answers;	/*instance field for each object created in class;
											  storage for arbitrary number of answers*/
	private  int TotalCards = 11;	//Number of cards in ArrayList
	private int index;	//Index field

	public BlueCards() {	//constructor to perform initialization
		chanceMaker = new Random();	//used to generate random numbers
		answers = new ArrayList<BlueCard>();	//each entry in ArrayList, referred to as answers
		fillAnswers();	//Call to fillAnswers method
		shuffle();	//Call to shuffle method
		collectCard();	//Call to collectCard method
	}

	private void fillAnswers(){	//method to add all possible card eventualities
		answers.add(new BlueCard("Shallow Water, No Oil", 0, 0));
		answers.add(new BlueCard("Shallow Water, Small Deposits, Light Drill", DrillMap.getDrillCost().get("Light"), 20000));
		answers.add(new BlueCard("Shallow Water, Medium Deposits, Light Drill", DrillMap.getDrillCost().get("Light"), 40000));
		answers.add(new BlueCard("Reef, No Oil",0,0));
		answers.add(new BlueCard("Reef, Small Deposits, Special Drill", DrillMap.getDrillCost().get("Special"), 20000));
		answers.add(new BlueCard("Reef, Medium Deposits, Special Drill", DrillMap.getDrillCost().get("Special"), 40000));
		answers.add(new BlueCard("Reef, Large Deposits, Special Drill", DrillMap.getDrillCost().get("Special"), 100000));
		answers.add(new BlueCard("Deep Water, No Oil",0,0));
		answers.add(new BlueCard("Deep Water, Small Deposits, Heavy Drill", DrillMap.getDrillCost().get("Heavy"), 20000));
		answers.add(new BlueCard("Deep Water, Medium Deposits, Heavy Drill", DrillMap.getDrillCost().get("Heavy"), 40000));
		answers.add(new BlueCard("Deep Water, Large Deposits, Light Drill", DrillMap.getDrillCost().get("Light"), 100000));

	}

	public BlueCard makeReply(){	//number picked at random between 0 and size of ArrayList
		int index = chanceMaker.nextInt(answers.size());	//Assigning a random int to index variable
		return answers.get(index);	//Return the answer stored at that index
	}

	public BlueCard collectCard() {	//Method to deal a card
		return answers.remove(0);	//Returns and removes answer stored at index-0
	}

	public static void shuffle() {	//Method to shuffle cards
		Collections.shuffle(answers);	//Shuffles cards using shuffle method from Collections class
	}

	public BlueCard dealCard(){	//Method to deal a card
		BlueCard bluecard = answers.get(index);	//Assign index of card to bluecard variable
		index++;	//Move the index along 1
		if (index > answers.size())	//If the index is greater than size of ArrayList
			index = 0;	//Index reverts to 0
		return bluecard;	//Return bluecard stored at index
	}

	public ArrayList<BlueCard> getAnswers() {	//Encapsulation getter method allowing viewing
		return answers;
	}

	public void setAnswers(ArrayList<BlueCard> answers) {	//Encapsulation getter method allowing modification
		BlueCards.answers = answers;
	}

	public int getTotalCards() {	//Encapsulation getter method allowing viewing
		return TotalCards;
	}

	public void setTotalCards(int totalCards) {	//Encapsulation getter method allowing modification
		TotalCards = totalCards;
	}

	public int getIndex() {	//Encapsulation getter method allowing viewing
		return index;
	}

	public void setIndex(int index) {	//Encapsulation getter method allowing viewing
		this.index = index;
	}

	public Random getChanceMaker() {	//allows access to chanceMaker method from another class
		return chanceMaker;				  
	}

	public void setChanceMaker(Random chanceMaker) { //allows values to be modified from a different class
		this.chanceMaker = chanceMaker;					  
	}
}

	
		
	
	
