package oilRig;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;
//import java.util.Iterator;


public class Greencards{ 

	private ArrayList<GreenCard> greenCards; 					//Setting ArrayList
    private int index = 0;											//keep current index in here...currentCard	

public Greencards() {							//Constructor
	greenCards = new ArrayList<GreenCard>();   //defining ArrayList
	makeDeckOfGreenCards();
	shufflemakeDeckOfGreenCards();
//	dealCard();
}

public void shufflemakeDeckOfGreenCards(){
	Collections.shuffle(greenCards);
}

private void makeDeckOfGreenCards(){
	greenCards.add(new GreenCard("Conseravtive", 0, 25, 20));
	greenCards.add(new GreenCard("Conservative", 0, 50, 10));
	greenCards.add(new GreenCard("Conservative", 0, 0,  20));
	greenCards.add(new GreenCard("Conservative", 0, 25, 20));  //responses in the ArrayList
	greenCards.add(new GreenCard("Conservative", 25, 25, 10));
	greenCards.add(new GreenCard("Conservative", 25, 50, 10));
	greenCards.add(new GreenCard("Labour", 75, 50, 5));
	greenCards.add(new GreenCard("Labour", 50, 50, 5));
	greenCards.add(new GreenCard("Labour", 50, 25, 10));
	greenCards.add(new GreenCard("Labour", 75, 75, 5));
}

//method to deal a card based on the current number stored in the field "currentCard"
	//Iterator<GreenCard> it = responses.iterator();
	//while(it.hasNext()) {   //method to maintain the order of the deck
	// call next = (responses);
	



public GreenCard dealCard(){  				//method to deal a card based on current number stored in field"dealCard"
	//called at the end of phase 3
	
	GreenCard greenCard = greenCards.get(index);
	index++;
	if(index > greenCards.size())
		index = 0;				//put validation around this so that if you reach the end of the arraylist, you set it to zero
    return greenCard;
}

//write a method that will just return the next card the deck, without advancing the index.

public ArrayList<GreenCard> getGreenCards(){
    return greenCards;
}

public int getindex(){
	return index;
}

public void  setgreenCards(ArrayList<GreenCard> greenCards){
	   this.greenCards = greenCards;
	}

public void setdealCard(int index){
	this.index = index;
}

}

