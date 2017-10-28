package ships;

public class Tender extends Ship {
	public Tender(){
		hitpoints = 140;
		armour = Integer.MAX_VALUE;
		speed = 30;
		type = "Support Ship";
		weapon = new Weapon[1];
		weapon[0] = new Weapon("Caulking Hammer", 15, 0.5, Integer.MAX_VALUE);
	}
}
