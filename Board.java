import java.util.ArrayList;

public class Board<Square> {

	boolean squareOccupied ;
	int numOfBluecards = 0;
	String drill;

	private Square[] nw = new Square[7];

	public int emptySquares(){	//Method that checks if there are any emptysquares in the array	
		int count = 0;	//Start count at 0
		for (Square nw : Square) {	//For loop
			if ( (boolean) (nw = null) ){	//Check for null elements
				count++;	//Increment count
			}
		}
		return count;
	}

	//write a method that will return a Square array with occupied squares...calcualting amount in phase 3


	public void blueCardPlacement()	{	//Method that will add a blue card to a square
		for (int i=0; i <= Square.length; i++)	{	//Loop through array
			if (Square[i] == null)	{	//Check there's space
				Square[i] = BlueCards.dealCard();	//Call method from BlueCards
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

	public Square[] getNw() {
		return nw;
	}

	public void setNw(Square[] nw) {
		this.nw = nw;
	}

	public void removeDrill()	{	// Method that will remove a drill from a square
		int n = 0;	//Local variable
		while (n<7){	//While loop, will run while condition is true
			Square[i] = Square [Square.length-1];	//Delete element from array
		}
	} 

	public void addDrill()	{	//Method that will add a drill to the square
		int index=0;	//Set index to )
		while (index < Square.length())	{	//While the index is less than array length
			nw.add(new drill);	//Add a drill
			index++;	//Increment index
		}

		public void playerPlacement()	{	// Method that assigns a player to a square
			for (int i=0; i <= Square.length; i++)	{	//Loop through array
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
