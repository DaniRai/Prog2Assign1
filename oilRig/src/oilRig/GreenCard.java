package oilRig;


public class GreenCard {
	private String party;
	private int capitalTax;
	private int revenueTax;
	private int interest;
	
	public GreenCard(String party, int capitalTax, int revenueTax, int interest) {
		super();
		this.party = party;
		this.capitalTax = capitalTax;
		this.revenueTax = revenueTax;
		this.interest = interest;
	}
	
	
	
	
	public String getparty(){					//Getters
	    return party;
	}
	
	public int getcapitalTax(){
		return capitalTax;
	}
	
	public int getrevenueTax(){
		return revenueTax;
	}
	
	public int getinterest(){
		return interest;
		
	}
	
	public void setparty(String Party){			//Setters
	   this.party = Party;
	}
	
	public void setcapitalTax(int CapitalTax){
		this.capitalTax = CapitalTax;
	}
	
	public void setrevenueTax(int RevenueTax){
		this.revenueTax = RevenueTax;
	}
	
	public void setinterest(int Interest){
		this.interest = Interest;
	}
}
