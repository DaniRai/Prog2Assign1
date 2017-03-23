package oilRig;

import java.util.HashSet;
//import java.util.HashSet;
import java.util.Scanner;
//import java.util.ArrayList;


public class Driver {

	private Scanner input;
	//private InputReader reader;
	private Player player;
	//private Board board;
	//private Responder responder;   

	public Driver(){
		input = new Scanner(System.in);
	//	responder = new Responder();
	//	reader = new InputReader();
	}
	
	 public static void main(String[] args) {
			Driver d = new Driver();
			d.printWelcome();
			d.runMenu();
			d.printGoodbye();
	}
	 
	 private void printWelcome()
	 {
		 System.out.println("Welcome to the North Sea Oil game\n");	        
	 } 
	 
		private int mainMenu(){ 			
	        System.out.println("North Sea Oil");
	        System.out.println("---------");     
	        System.out.println("  1) Troubleshoot");    
	        System.out.println("  2) Instructions");    
	        System.out.println("  3) Play Game"); 
	        System.out.println("-----------------");
	        System.out.println("  0) Exit");
	        System.out.print("==>> ");
	        boolean goodInput = false;
			int option = 0;
			do{
				try {
	        option = input.nextInt();
	        goodInput=true;
		}
		catch (Exception e){
			String throwOut = input.nextLine();
			System.out.println("Number required - you entered text");
		}
		}while(!goodInput);
	        return option;
		   }
		
	private void runMenu()
	    {
	        int option = mainMenu();
	        while (option != 0)
	        {           
	            switch (option)
	            {
	               case 1:   System.out.println("Please type your question?");
	           				HashSet<String> input = reader.getInput();
	           				while(!input.contains("bye"))
	           				{
	           					String responses = responder.generateResponse(input);
	           					System.out.println(responses);              	 
	           					input = reader.getInput();
	           				}
	            	         break;
	               case 2:   responder.instructions();
	                         break;
	               case 3:   secondMenu();
	               			 break;
	               default:  System.out.println("Invalid option entered: " + option);
	                         break;
	             }
	            System.out.println("\nPress any key to continue...");
	            input.nextLine();
	            input.nextLine();  
	            option = mainMenu();           
	        }
	        System.out.println("Exiting... bye");
	        System.exit(0);
	    }
		
		public void addPlayer(){		
			input.nextLine();
	        System.out.print("Enter the Players Name:  ");
	        String playerName = input.nextLine();
	        players.add(player=new Player(playerName));        
		}
		
		private void processPlayers(){
			boolean goodInput = false;
			int numberPlayers =0;
			do{
				try {
					System.out.print("How many players would like to play? ");
						numberPlayers = input.nextInt();
						numberOfPlayers(numberPlayers);
						goodInput=true;
					}
				
				catch (Exception e){
					String throwOut = input.nextLine();
					System.out.println("Number required - you entered text");
				}
				}while(!goodInput);		
			Players=new Player();		
			for(int i=0; i<numberPlayers;i++){
				addPlayer();
			}
			for(int i=0; i<numberPlayers;i++){
				System.out.println(board.getPlayers().get(i)+"\n");
			}
		}
		
		/**
		* Ensures there are only 2-6 players
		*/
		private void numberOfPlayers(int numberOfPlayers){
			if((numberOfPlayers<2)||(numberOfPlayers>6)){
				System.out.println("You can only have 2-6 players.");
				System.out.print("Please try again\n");
				processPlayers();
			}
				
		}
		  public void board() throws Exception{
			  try{
				  baord= HandleXML.read("board.xml");
						}
						catch(Exception e)
						{
						System.out.println("Error reading from file:  " + e);
						}
			  
		  } 
			private int startMenu() 
			  
			{  
			 
			  System.out.println("---------"); 
			  System.out.println("Choose a Number From Menu");
			  System.out.println("---------");       
			  System.out.println("  1) ....");
			  System.out.println("  2) ....");
			  System.out.println("  3) ....");
			  System.out.println("  4) List Board Squares");
			  System.out.println("----------");
			  System.out.println("  0) Exit");
			  System.out.print("==>> ");
			  int option = input.nextInt();
			  return option;
			}	
			private void secondMenu()
		    {
		        int option = startMenu();
		        while (option != 0)
		        {           
		            switch (option)
		            {
		               case 1:  ...
		            	         break;
		               case 2:   ...
		                         break;
		               case 3:   board();
		               			 break;
		               default:  System.out.println("Invalid option entered: " + option);
		                         break;
		             }
		            System.out.println("\nPress any key to continue...");
		            input.nextLine();
		            input.nextLine();  
		            option = startMenu();           
		        }
		        System.out.println("Exiting... bye");
		        System.exit(0);
		    }
		
	

	
	
	
	
	
	
	
	
	
	
	
}
	 

	 
	 
