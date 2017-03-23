package oilRig;


import java.util.ArrayList;
import java.util.Collections;

public class BrownCards {
	private ArrayList<BrownCard>brownCards; 					//Setting ArrayList
    private int index = 0;											//keep current index in here...	

	
	public BrownCards() {									//Constructor
		brownCards = new ArrayList<BrownCard>(); 				//Defining ArrayList
		makeDeckOfBrownCards();
		shufflemakeDeckOfBrownCards();
		//dealCard(0);		//called in the main
	}
	

	public void shufflemakeDeckOfBrownCards(){
		Collections.shuffle(brownCards);
	}


	private void makeDeckOfBrownCards(){
		brownCards.add(new BrownCard("Spring", "Good",  "Good",  "Good", "Good"));
		brownCards.add(new BrownCard("Spring", "Storm", "Rough", "Storm", "Rough"));
		brownCards.add(new BrownCard("Spring", "Rough", "Rough", "Good", "Good"));
		brownCards.add(new BrownCard("Summer", "Storm", "Rough", "Storm", "Good"));  //Responses in the ArrayList
		brownCards.add(new BrownCard("Summer", "Good", "Good", "Good", "Good"));
		brownCards.add(new BrownCard("Autumn", "Rough", "Good", "Good", "Good"));
		brownCards.add(new BrownCard("Autumn", "Good", "Good", "Good", "Good"));
		brownCards.add(new BrownCard("Autumn", "Good", "Rough", "Good", "Good"));
		brownCards.add(new BrownCard("Winter", "Rough", "Gale", "Rough", "Gale"));
		brownCards.add(new BrownCard("Winter", "Gale", "Gale", "Storm", "Storm"));
		brownCards.add(new BrownCard("Winter", "Gale", "Rough", "Gale", "Rough"));
		brownCards.add(new BrownCard("Winter", "Good", "Good", "Good", "Good"));
		
	}
	

	public BrownCard dealCard(){  				//method to deal a card based on current number stored in field"dealCard" 
		
		BrownCard brownCard = brownCards.get(index);
		index++;
		if(index > brownCards.size())
			index = 0;		//put validation around this so that if you reach the end of the arraylist, you set it to zero
	    return brownCard;
	    
	}
	
	public ArrayList<BrownCard> getBrownCards(){
	    return brownCards;
	}

	public int getindex(){
		return index;
	}

	public void  setbrownCards(ArrayList<BrownCard> brownCards){
		   this.brownCards = brownCards;
		}

	public void setdealCard(int index){
		this.index = index;
	}
	
}
 

