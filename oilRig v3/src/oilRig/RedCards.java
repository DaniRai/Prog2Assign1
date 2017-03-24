package oilRig;

import java.util.ArrayList;	//importing ArrayList method 
import java.util.Random;	//importing random method
import java.util.Collections;	//importing collections method

public class RedCards<Card> {	//declaration of RedCard class
	private Random chanceMaker;	//instance field for each object created in class
	private static ArrayList<RedCard>answers;	/*instance field for each object created in class;
											  storage for arbitrary number of answers*/
	private  int TotalCards = 4;	//Number of cards in ArrayList
	private int index;	//Index field

	public RedCards() {	//constructor to perform initialization
		chanceMaker = new Random();	//used to generate random numbers
		answers = new ArrayList<RedCard>();	//each entry in ArrayList, referred to as answers
		fillAnswers();	//Call to fillAnswers method
		shuffle();	//Call to shuffle method
		collectCard();	//Call to collectCard method
	}

	private void fillAnswers(){	//method to add all possible card eventualities
		answers.add(new RedCard(4));
		answers.add(new RedCard(10));
		answers.add(new RedCard(20));
		answers.add(new RedCard(0));
		
	}

	public RedCard makeReply(){	//number picked at random between 0 and size of ArrayList
		int index = chanceMaker.nextInt(answers.size());	//Assigning a random int to index variable
		return answers.get(index);	//Return the answer stored at that index
	}

	public RedCard collectCard() {	//Method to deal a card
		return answers.remove(0);	//Returns and removes answer stored at index-0
	}

	public static void shuffle() {	//Method to shuffle cards
		Collections.shuffle(answers);	//Shuffles cards using shuffle method from Collections class
	}

	public RedCard dealCard(){	//Method to deal a card
		RedCard redcard = answers.get(index);	//Assign index of card to Redcard variable
		index++;	//Move the index along 1
		if (index > answers.size())	//If the index is greater than size of ArrayList
			index = 0;	//Index reverts to 0
		return redcard;	//Return redcard stored at index
	}

	public ArrayList<RedCard> getAnswers() {	//Encapsulation getter method allowing viewing
		return answers;
	}

	public void setAnswers(ArrayList<RedCard> answers) {	//Encapsulation getter method allowing modification
		RedCards.answers = answers;
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

	
		
	
	
