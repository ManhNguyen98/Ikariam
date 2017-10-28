package ships;

public class BalloonCarrier extends Ship {
	public BalloonCarrier(){
		hitpoints = 140;
		armour = Integer.MAX_VALUE;
		speed = 20;
		type = "Carrier Ship";
		weapon = new Weapon[1];
		weapon[0] = new Weapon("Ballon Attack", 100, 0.5, 5);
	}
}
