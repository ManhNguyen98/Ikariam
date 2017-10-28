package building;

public class Town {
	
	private int level = 1;
	private StringBuffer owner;
	public Shipyard shipyard = new Shipyard();
	public StringBuffer imgPath;
	private int X;
	private int Y;
	
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

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}
	
}
