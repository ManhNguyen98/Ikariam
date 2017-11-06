package building;

public class Town {
	
	private int level = 1;
	private String owner; //mine, enemy, allies 
	public Shipyard shipyard = new Shipyard();
	public String imgPath;
	private int X;
	private int Y;
	
	public Town(){
		setLevel(1);
	}
	
	public Town(int level, String owner, int X, int Y){
		setLevel(level);
		setOwner(owner);
		setX(X);
		setY(Y);
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner2) {
		this.owner = owner2;
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
	
	public void display(){
		System.out.println("Town : ");
		System.out.print(this.level + " ");
		System.out.print(this.owner + " ");
		System.out.print(this.X + " ");
		System.out.print(this.Y + " ");
	}	
	
	public boolean setShipyard(int level){
		if(level > this.level) return false;
		shipyard.setLevel(level);
		return true;
	}
}
