package ships;

public class MortarShip extends Ship {
	public MortarShip(){
		hitpoints = 112;
		armour = 6;
		speed = 30;
		type = "Long-Range Fighter";
		weapon = new Weapon[2];
		weapon[0] = new Weapon("Projectile", 69, 0.1, 5);
		weapon[1] = new Weapon("Hull", 37, 0.5, Integer.MAX_VALUE);
	}
}
