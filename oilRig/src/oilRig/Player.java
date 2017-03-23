package oilRig;

public class Player {			//Constructor
	  
    private int borrow;		//Borrowings from Bank (500K-1M Max 4M)
    private int balance;    //Running Balance...amount of cash they currently hold      
    private int id;			//Which Player?
    
    private static int numberOfPlayers = 0;
        
    public Player(int startBorrow, int startBalance) {		//constructor
        borrow = startBorrow;
        balance = startBalance;
        id = ++numberOfPlayers;
    }

    public Player(int startBorrow) {		//constructor
        borrow = startBorrow;
        id = ++numberOfPlayers;
    }

    public Player() {		//constructor
        id = ++numberOfPlayers;
    }

    public int getID() {	//Player 1, 2 or 3 etc.
        return id;
    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getBorrow() {
        return borrow;
    }
        
    public void setBorrow(int newValue) {
        borrow = newValue;
    }
                    
    public int getBalance() {
        return balance;
    }
        
    public void setBalance(int newValue) {
        balance = newValue;
    }   
//		System.out.println(Player.2String());		
}














