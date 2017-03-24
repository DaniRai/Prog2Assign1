package oilRig;

import java.util.Scanner;

public class Bank {
	private double moneys;          //total money owned
	private double loans;           //total current loans
	private BankMenu bankMenu;
	private double totalBorrowing;  //total alltime loans
	private double interest;  		//interest owed
	private double totalRepayments; //total repayments made
	private double revenue;         //revenue earned 
	private int potential;       	//Potential Barrels
	private int ppb;			 	//Price per Barrel
	private int weather;		 	//Current weather
	private double capTax;			//Capital Tax
	private double revTax;			//Revenue Tax
	private int heavyDrill;			//number of Heavy Drills
	private int specialDrill;		//number of Special Drills
	private int lightDrill;			//number of Light Drills
	private int numOfPlayers;
	private Scanner input;
	private boolean[] active = new boolean[1];
	private double[] auction = new double[numOfPlayers];


	public Bank() {
		input = new Scanner(System.in);		
	}
	
	public void openBank(){
		
	}
	
	public void loan(int loan){  
		if(active[0] == false){  																	//boolean allows only one learn per turn
			if(loan == 1000000 && loans <= 3000000)  												//checks loans are allowed for 1mil/
			{
				moneys += loan; 																	//updates total money owned
				loans += loan;   																	//updates current loans
				totalBorrowing += loan;  															//updates alltime loans
				System.out.println("Current Money: " + moneys + " Current Loans: " + loans);  		//print updates funds and loans
				active[0] = true;  																	//set to true to stop multiple loans per round
			} else if(loan == 500000 && loans <= 3500000)  											//checks loans for half mil are allowed
			{
				moneys += loan; 																	//updates total money owed
				loans += loan;  																	//updates current loans
				totalBorrowing += loan;  															//update alltime loans
				System.out.println("Current Money: " + moneys + " Current Loans: " + loans);  		//print updates funds and loans
				active[0] = true;  																	//set to true to stop multiple loans per round
			} else {
				System.out.println("Sorry we are unable to fulfill this transaction"); 				//prints if borrowing is not allowed this turn
				System.out.println("Your current loan amount is: " + loans);
			}
		}else if(active[0] == true){
			System.out.println("You've already borrowed this turn."); 								//prints if you try to borrow more than once per turn
		}
	}	
	
	public void drills(int select){
		if(select == 1){  																				//if loop to decide which drill is being purchased
			System.out.println("Would you like to purchase this Light drill for $100,000 (Y/N)");  		//confirm selection
			input.nextLine();
			String reply = input.nextLine();  
			if((reply == "Y") || (reply == "y")){ 														//confirm response
				moneys -= 100000; 																		//reduced total monies by set amount
				lightDrill++;																			//increase number of light drills by 1
				System.out.println("Your new balance is: " + moneys); 									//print new balance
			}else{
				System.out.println("Please choose again."); 											//incase you choose wrong
			}
		}else if(select == 2){  																		//if loop to decide which drill is being purchased
			System.out.println("Would you like to purchase this Special Drill for $250,000 (Y/N)");
			input.nextLine();
			String reply = input.nextLine();
			if((reply == "Y") || (reply == "y")){  														//confirm response
				moneys -= 250000;  																		//reduced total monies by set amount
				specialDrill++;																			//increase number of special drills by 1
				System.out.println("Your new balance is: " + moneys);  									//print new balance
			}else{
				System.out.println("Please choose again.");  											//incase you choose wrong
			}
		}else if(select == 3){  																		//if loop to decide which drill is being purchased
			System.out.println("Would you like to purchase this Heavy Drill for $500,000 (Y/N)");
			input.nextLine();
			String reply = input.nextLine();
			if((reply == "Y") || (reply == "y")){  														//confirm response
				moneys -= 500000;  																		//reduced total monies by set amount
				heavyDrill++;																			//increase number of heavy drills by 1
				System.out.println("Your new balance is: " + moneys);  									//print new balance
			}else{
				System.out.println("Please choose again.");  											//incase you choose wrong
			}
		}else{
			System.out.println("Invalid selection please choose again");
		}
	}
	
	public void testSites(){
		System.out.println("How many Sites would you like to test?");  								//choose number of sites to test
		System.out.println("Please choose between 1 and 3 sites");
		int numSites = input.nextInt();
		if(numSites > 3){ 																			//if more than 3 is chosen 
			System.out.println("Invalid Selection"); 												//print note
			testSites();  																			//restart method
		}else if(numSites == 0){  																	//if 0 chosen
			bankMenu.runMenu(); 																	//return to main menu
		}else{
			int cost = numSites*100000;  															//calculate cost by multiplying number of sites by set figure
			System.out.println("Total cost is: " + cost + ". Would you like to proceed?"); 			//confirm test
			input.nextLine();
			String reply = input.nextLine();
			if((reply == "Y") || (reply == "y")){ 													//test response
				moneys -= cost; 																	// reduce money by cost of testing
				System.out.println("Your new balance is: " + moneys); 								//print new balance
			}else if((reply == "N") || (reply == "n")){
				System.out.println("Please choose again."); 
			}
		}
	}
	
	public void loanRepay(){		
		calcInterest();
		System.out.println("Your current loans are: " + loans);  									//prints current loan
		System.out.println("Your current interest is: " + interest); 								//print current interest
		System.out.println("Total Monies Owed: " + (loans + interest)); 							//print total owed
		System.out.println("How much would you like to pay off: "); 
		int repayment = input.nextInt();
		if (repayment > moneys){ 																	//check to see if funds are available
			System.out.println("You do not have this much money!"); 								//print if funds unavailable
			System.out.println(" ");
			loanRepay();
		} else {
			double remain = repayment - interest;
			if(remain < 0){ 																		//ensured remainder after interest is not a negative figure
			remain = 0;   
			}
			moneys -= remain;																		//reduce total money 
			interest = 0;																			//reduce interest to nil once paid
			System.out.println("Your new Balance is: " + moneys); 									//print new balance
		}		
	}
	
	public void calcRevenue(){  																	//calculate total revenue this turn
		int yield = potential * weather; 															//potential in barrels x weather modifier = yield
		revenue = yield * ppb;																		//revenue = yield x price per barrel
		moneys += (revenue - revTax);																//add revenue to monies after tax
		System.out.println("Your pre-tax revenue: " + revenue);										//print pretax revenue
		System.out.println("After Tax: " + (revenue - revTax));										//print revenue after tax
	}
	
	public void drillTransfer(){  																	//method for transfering drills
		System.out.println("Your current balance is: " + moneys); 									//displays available funds
		System.out.println(" ");
		System.out.println("Are you sure you would like to transfer a drill?"); 					//confirm purchase
		input.nextLine();
		String reply = input.nextLine(); 
		if((reply == "Y") || (reply == "y")){									    				//test for confirmation
			moneys -= 20000; 																		//reduce money by set figure
			System.out.println("Your new balance is: " + moneys); 									//displays ammended funds
		}else if((reply == "N") || (reply == "n")){
			bankMenu.runMenuThree(); 																//return to menu
		}		
	}
	
	public void listInv(){																			//List inventory of drills
		System.out.println("You currently own: ");
		System.out.println(lightDrill+ " :Light Drills");											//number of Light Drills
		System.out.println(specialDrill+ " :Special Drills");										//number of Special Drills
		System.out.println(heavyDrill+ " :Heavy Drills");											//number of Heavy Drills
	}
	
	public void sellDrill(){																		//Method for selling Drills
		
	}
	
	public void buyConc(){																			//Method for purchasing Concessions
		double highBid = 0;
		int player = 1;
		for(int i = 0; i < numOfPlayers; i++){
			System.out.println("Player " + player + " what is your bid?");
			auction[i] = input.nextInt();
			player++;
		}
		for(int i = 0; i < numOfPlayers; i++){
			if(auction[i] > highBid){
				highBid = auction[i];
				player = i;
			}
		}
			System.out.println("The highest bidder is Player " + player + " with " + highBid);
		}		
		
	public void sellConc(){																			//Method for selling Concessions
		
	}
	
	public void calcCapTax(){ 																		//cap used as placeholder until linking
		if(cap == 0){																				//changed percentage to correct decimal
			int cPercent = 0;
		}else if(cap == 25){
			double cPercent = .25;
		}else if(cap == 50){
			double cPercent = .5;
		}else if(cap == 75){
			double cPercent = .75;
		}
		capTax = moneys * cPercent; 																//calculates the capitcal tax figure
	}
	
	public void calcRevTax(){  																		//rev used as placeholder until linking
		if(rev == 0){																				//changes percentage to correct decimal
			int rPercent = 0;
		}else if(rev == 25){
			double rPercent = .25;
		}else if(rev == 50){
			double rPercent = .5;
		}else if(rev == 75){
			double rPercent = .75;
		}
		revTax = moneys * rPercent; 																//calculates the revenue tax figure
	}
	
	public void calcInterest(){ 																	//inter used as placeholder until linking
		if(inter == 5){																				//changes percentage to correct decimal 
			int iPercent = .05;
		}else if(inter == 10){
			double iPercent = .1;
		}else if(inter == 20){
			double iPercent = .2;
		}		
		interest = moneys * iPercent; 																//calculates the interest figure
	}

	public double getMoneys() {																		//Getters and Setters
		return moneys;
	}

	public void setMoneys(double moneys) {
		this.moneys = moneys;
	}

	public double getLoans() {
		return loans;
	}

	public void setLoans(double loans) {
		this.loans = loans;
	}

	public BankMenu getBankMenu() {
		return bankMenu;
	}

	public void setBankMenu(BankMenu bankMenu) {
		this.bankMenu = bankMenu;
	}

	public double getTotalBorrowing() {
		return totalBorrowing;
	}

	public void setTotalBorrowing(double totalBorrowing) {
		this.totalBorrowing = totalBorrowing;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getTotalRepayments() {
		return totalRepayments;
	}

	public void setTotalRepayments(double totalRepayments) {
		this.totalRepayments = totalRepayments;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public int getPotential() {
		return potential;
	}

	public void setPotential(int potential) {
		this.potential = potential;
	}

	public int getPpb() {
		return ppb;
	}

	public void setPpb(int ppb) {
		this.ppb = ppb;
	}

	public int getWeather() {
		return weather;
	}

	public void setWeather(int weather) {
		this.weather = weather;
	}

	public int getHeavyDrill() {
		return heavyDrill;
	}

	public void setHeavyDrill(int heavyDrill) {
		this.heavyDrill = heavyDrill;
	}

	public int getSpecialDrill() {
		return specialDrill;
	}

	public void setSpecialDrill(int specialDrill) {
		this.specialDrill = specialDrill;
	}

	public int getLightDrill() {
		return lightDrill;
	}

	public void setLightDrill(int lightDrill) {
		this.lightDrill = lightDrill;
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public boolean[] getActive() {
		return active;
	}

	public void setActive(boolean[] active) {
		this.active = active;
	}

	public double[] getAuction() {
		return auction;
	}

	public void setAuction(double[] auction) {
		this.auction = auction;
	}
}