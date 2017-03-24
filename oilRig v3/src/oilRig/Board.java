package oilRig;

import java.util.ArrayList;

public class Board<Square> {

	boolean squareOccupied ;
	int numOfBluecards = 0;
	String drill;
	
	private ArrayList<Square> nw = new ArrayList<Square>();
	

	public int emptySquares(){	//Method that checks if there are any emptysquares in the array	
		int count = 0;	//Start count at 0
		for (Square nw : nw) {	//For loop
			if ( (boolean) (nw = null) ){	//Check for null elements
				count++;	//Increment count
			}
		}
		return count;
	}

	//write a method that will return a Square array with occupied squares...calcualting amount in phase 3
	
	public ArrayList<Square> getemptySquares (ArrayList<Square> squares, int populatedSquare){
		squares = newArrayList<Square>();
		
		for (int i = 0; i < squares.size(); i++){
			Square newSquare = squares.get(i);
			ArrayList<Square> populatedSquares = newSquare. getpopulatedSquares();
			if(populatedSquares.size() > squares.size())
				return populatedSquares;
					}
				}
			while (squares == null){
				return squares;
			}
			

	public void blueCardPlacement()	{	//Method that will add a blue card to a square
		
	     
		for (int i=0; i <= nw.size(); i++)	{
			//Loop through array
			 Square nww = nw.get(i);
			if (nw.get(i) == null)	{	//Check there's space
				nww = BlueCards.dealCard();	//Call method from BlueCards
			}
		}
	}

	public boolean isSquareOccupied() {
		return squareOccupied;
	}

	public void setSquareOccupied(boolean squareOccupied) {
		this.squareOccupied = squareOccupied;
	}

	public int getNumOfBluecards() {
		return numOfBluecards;
	}

	public void setNumOfBluecards(int numOfBluecards) {
		this.numOfBluecards = numOfBluecards;
	}

	public String getDrill() {
		return drill;
	}

	public void setDrill(String drill) {
		this.drill = drill;
	}

	public ArrayList<Square> getnw() {
		return nw;
	}

	public void setnw(ArrayList<Square> nw) {
		this.nw = nw;
	}

	public void removeDrill()	{	// Method that will remove a drill from a square
		int n = 0;	//Local variable
		while (n<7){	//While loop, will run while condition is true
			Square[i] = Square [nw.size -1];	//Delete element from array
		}
	} 

	public void addDrill()	{	//Method that will add a drill to the square
		int index=0;	//Set index to )
		while (index < nw.size())	{	//While the index is less than array length
			nw.add(new drill);	//Add a drill
			index++;	//Increment index
		}

		public void playerPlacement()	{	// Method that assigns a player to a square
			for (int i=0; i <= nw.size(); i++)	{	//Loop through array
				if ( (blueCard == false) && (player == Bank.buyConc.player) )	{	//If square is empty and player has won the bid
					nw.add(new player);	//Add player to array
					squareOccupied = true;	//Set square to occupied
					numOfBluecards++;	//Increment array index
					else {
						System.out.println("No empty site in North-West");
					}
				}
			}
		}







}