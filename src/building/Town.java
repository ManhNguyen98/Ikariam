package building;

public class Town {
	
	private int level;
	private StringBuffer owner;
	public Shipyard shipyard;
	public StringBuffer imgPath;
	
	public Town(){
		setLevel(1);
	}
	
	public Town(int level, StringBuffer owner){
		setLevel(level);
		setOwner(owner);
	}
	
	public StringBuffer getOwner() {
		return owner;
	}
	
	public void setOwner(StringBuffer owner) {
		this.owner = owner;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		if(level <= 0) level = 1;
		this.level = level;
		// Image change when level change
	}
	
}
