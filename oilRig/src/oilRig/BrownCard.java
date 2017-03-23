package oilRig;


public class BrownCard {
	private String season;
	private String NW;
	private String NE;
	private String SW;
	private String SE;
	
	public BrownCard(String season, String NW, String NE, String SW, String SE) {
		super();
		this.season = season;
		this.NW = NW;
		this.NE = NE;
		this.SW = SW;
		this.SE = SE;
	}
	
	
	public String getseason(){					//Getters
	    return season;
	}
	
	public String getNW(){
		return NW;
	}
	
	public String getNE(){
		return NE;
	}
	
	public String getSW(){
		return SW;
	}
	
	public String getSE(){
		return SE;
	}
	
	public void setseason(String season){		//Setters
		   this.season = season;
		}
	
	public void setNW(String NW){
		this.NW = NW;
	}
	
	public void setNE(String NE){
		this.NE = NE;
	}
	
	public void setSW(String SW){
		this.SW = SW;
	}
	
	public void setSE(String SE){
		this.SE = SE;
	}
   //accessor, muttors...	
}

