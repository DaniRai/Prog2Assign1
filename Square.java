import java.util.ArrayList;

//siobhan wrote this...

public class Square 
{
	private Player player;
	private BlueCard blueCard;
	private String drillMapKey;
	
    public Square() {
    	this.player = null;
    	this.blueCard = null;
    	this.drillMapKey = null;
    }
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public BlueCard getBlueCard() {
		return blueCard;
	}
	public void setBlueCard(BlueCard blueCard) {
		this.blueCard = blueCard;
	}
	public String getDrillMapKey() {
		return drillMapKey;
	}
	public void setDrillMapKey(String drillMapKey) {
		this.drillMapKey = drillMapKey;
	}
	@Override
	public String toString() {
		return "Square [blueCard=" + blueCard + ", drillMapKey=" + drillMapKey + "]";
	}
	
	
	

}
