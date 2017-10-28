package ships;

public class RocketShip extends Ship {
	public RocketShip(){
		hitpoints = 65;
		armour = 6;
		speed = 30;
		type = "First Strike";
		weapon = new Weapon[2];
		weapon[0] = new Weapon("Rocket", 380, 0.2, 2);
		weapon[1] = new Weapon("Hull", 20, 0.8, Integer.MAX_VALUE);
	}
}
