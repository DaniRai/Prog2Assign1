package oilRig;

import java.util.Scanner;

public class BankMenu {
	private Scanner input;
	private Bank bank;

		public BankMenu() 
		{
			input = new Scanner(System.in);
			bank = new Bank();
			runMenu();
		}
	
		public static void main(String[] args){
			BankMenu app = new BankMenu();
		}

		private int bankMenu()
	    { 
	        System.out.println("Bank Menu");
	        System.out.println("---------");     
	        System.out.println("  1) Loans");    
	        System.out.println("  2) Test Sites");    
	        System.out.println("  3) Drills");        
	        System.out.println("  4) Concessions");       
	        System.out.println("  0) Exit");
	        System.out.print("==>> ");
	        int option = input.nextInt();
	        return option;
	    }
	    
	    private int loanMenu()
	    {
	    	System.out.println("Loan's Menu");
	        System.out.println("------------");
	        System.out.println("  1) Request Loan of 1 million");
	        System.out.println("  2) Request Loan of 500,000");
	        System.out.println("  3) Repay Loan");
	        System.out.println("  0) Return to main Bank Menu");
	        int optionTwo = input.nextInt();
	        return optionTwo;
	    }
	    
	    private int drillMenu()
	    {
	    	System.out.println("Drill's Menu");
	        System.out.println("------------");
	        System.out.println("  1) Purchase a Drill");
	        System.out.println("  2) Sell a Drill");
	        System.out.println("  3) Transfer a Drill");
	        System.out.println("  4) List Drill Inventory");
	        System.out.println("  0) Return to main Bank Menu");
	        int optionThree = input.nextInt();
	        return optionThree;	   
	    }
	    
	    private int drillShopMenu()
	    {
	    	System.out.println("Drill Shop Menu");
	        System.out.println("------------");
	        System.out.println("  1) Purchase a Light Drill for 100,000");
	        System.out.println("  2) Purchase a Special Drill for 250,000");
	        System.out.println("  3) Purchase a Heavy Drill for 500,000");
	        System.out.println("  0) Return to Drill's Menu");
	        int optionFour = input.nextInt();
	        return optionFour;	    
	    }
	    
	    private int concMenu()
	    {
	    	System.out.println("Concession's Menu");
	        System.out.println("------------");
	        System.out.println("  1) Buy a Concession");
	        System.out.println("  2) Sell a Concession");
	        System.out.println("  0) Return to main Bank Menu");
	        int optionFive = input.nextInt();
	        return optionFive;	   
	    }
	    
	    
	    public void runMenu()
	    {
	        int option = bankMenu();
	        while (option != 0)
	        {
	           
	            switch (option)
	            {
	               case 1:    runMenuTwo();
	            	          break;
	               case 2:    bank.testSites();
	                          break;
	               case 3:    runMenuThree();
	            	          break;
	               case 4:    runMenuFive();
	                          break;
	              default:    System.out.println("Invalid option entered: " + option);
	                          break;
	            }
	            System.out.println("\nPress any key to continue...");
	            input.nextLine();
	            input.nextLine(); 
	            option = bankMenu();
	        }
	     }
	    
	    public void runMenuTwo()
	    {
	    	int optionTwo = loanMenu();
	    	while (optionTwo != 0)
	    	{
	    		switch(optionTwo)
	    		{
		    		case 1:		bank.loan(1000000);
								break;
		    		case 2:		bank.loan(500000);
								break;
		    		case 3:		bank.loanRepay();
		    					break;
	    		}
	    		 System.out.println("\nPress any key to continue...");
		         input.nextLine();
		         input.nextLine(); 
		         optionTwo = loanMenu();
	    	}
	   	}
	    
	    public void runMenuThree()
	    {
	    	int optionThree = drillMenu();
	    	while (optionThree !=0)
	    	{
	    		switch(optionThree)
	    		{
	    		case 1:		runMenuFour();
	    					break;
	    		case 2:		bank.sellDrill();
	    					break;
	    		case 3:		bank.drillTransfer();
	    					break;
	    		case 4:		bank.listInv();
	    					break;
	    		}
	    		 System.out.println("\nPress any key to continue...");
		         input.nextLine();
		         input.nextLine(); 
		         optionThree = loanMenu();
	    	}
	    }
	    
	    public void runMenuFour()
	    {
	    	int optionFour = drillShopMenu();
	    	while (optionFour != 0)
	    	{
	    		switch(optionFour)
	    		{
		    		case 1:		bank.drills(1);
								break;
		    		case 2:		bank.drills(2);
								break;
					case 3:		bank.drills(3);
		    				    break;
	    		}
	    		 System.out.println("\nPress any key to continue...");
		         input.nextLine();
		         input.nextLine(); 
		         optionFour = drillShopMenu();
	    	}
	   	}
	    
	    public void runMenuFive()
	    {
	    	int optionFive = concMenu();
	    	while (optionFive != 0)
	    	{
	    		switch(optionFive)
	    		{
	    			case 1: bank.buyConc();
	    					break;
	    			case 2: bank.sellConc();
	    					break;
	    		}
	    		 System.out.println("\nPress any key to continue...");
		         input.nextLine();
		         input.nextLine(); 
		         optionFive = concMenu();
	    	}
	    }
	
		public Scanner getInput() {
			return input;
		}
	
		public void setInput(Scanner input) {
			this.input = input;
		}
	
		public Bank getBank() {
			return bank;
		}
	
		public void setBank(Bank bank) {
			this.bank = bank;
		}	
}