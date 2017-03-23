	import java.util.ArrayList;	
	import java.util.Scanner;
	
	public class Players {										//Creating and Declaring Array of 6 Players
		ArrayList<String> players = new ArrayList<>(6);
		private double currentMoney;							//Current Money from Bank
		private double currentLoans;							//Current Loans from Bank
		private double loanRepay;								//Current Loans to be Repaid from Bank
		
	public Players()											//Initialization of ArrayList
	    {
	    	players = new ArrayList<String>(6);
	    }
		
	public static void playerCounter(Scanner input){			//Counter for Players Turn
			int[]playerCounter = new int[6];
			for (int i = 0; i < 6; i++)
			{
				System.out.print(("It is the turn of Player number : "));
				playerCounter[i] = input.nextInt();
			}
		}				
	public static void turnCounter(Scanner input){				//Counter for Players Turn 1, 2 & 3
		int[]turnCounter = new int[3];
		for (int i = 0; i < 3; i++)
		{
			System.out.print(("This is turn number : "));
			turnCounter[i] = input.nextInt();
		}
	}	
    public void storePlayer(String player){						//Stores all the players
    	players.add(player);
    }
    
    public int numberOfPlayers(){								//Shows the number of players
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
    	public void storeCurrentMoney (double currentMoney)		//Store CurrentMoney Figure
    	{
    		this.setCurrentMoney(currentMoney);
    	}
    	
    	public void storeCurrentLoans (double currentLoans)		//Store CurrentLoans Figure
    	{
    		this.setCurrentLoans(currentLoans);
    	}
    	
    	public void storeLoanRepay (double currentLoans)		//Store LoanRepay Figure
    	{
    		double loanRepay = 0;
			this.setLoanRepay(loanRepay);
    	}

		public double getCurrentLoans() {						//CurrentLoans Getter
			return currentLoans;
		}

		public void setCurrentLoans(double currentLoans) {		//CurrentLoans Setter
			this.currentLoans = currentLoans;
		}

		public double getCurrentMoney() {						//CurrentMoney Getter
			return currentMoney;
		}

		public void setCurrentMoney(double currentMoney) {		//CurrentMoney Setter
			this.currentMoney = currentMoney;
		}

		public double getLoanRepay() {							//LoanRepay Getter
			return loanRepay;
		}

		public void setLoanRepay(double loanRepay) {			//LoanRepay Setter
			this.loanRepay = loanRepay;
		}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
