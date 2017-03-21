	import java.util.ArrayList;
	import java.util.Scanner;
	
		//Creating and Declaring the Array of 6 Players
	public class Players {
		ArrayList<String> players = new ArrayList<>(6);
		
	public Players()	//Initialization of ArrayList
	    {
	    	players = new ArrayList<String>(6);
	    }
		
	public static void playerCounter(){
			int[]playerCounter = new int[6];
			int sum =0;
			
			for (int i = 0; i < 6; i++)
			{
				System.out.print(("It is the turn of Player number : ");
				playerCounter[i] = input.nextInt();
				sum += playerCounter[i];
			}
		}
				
	public static void turnCounter(){
		int[]turnCounter = new int[3];
		int sum =0;
		
		for (int i = 0; i < 3; i++)
		{
			System.out.print(("This is turn number : ");
			turnCounter[i] = input.nextInt();
			sum += turnCounter[i];
		}
	}
			       
    public void storePlayer(String player){	//Stores all the players
    	players.add(player);
    }
    
    public int numberOfPlayers(){		//Shows the number of players
    	return players.size();
    }
    
    public void showPlayer(int playerNumber)
    {
    	if(playerNumber <2){
    	}
    	else if(playerNumber<numberOfPlayers()){
    		System.out.println(players.get(playerNumber));
    	}
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
