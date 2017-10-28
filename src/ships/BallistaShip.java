package ships;

public class BallistaShip extends Ship{
	public BallistaShip(){
		hitpoints = 154;
		armour = 14;
		speed = 40;
		type = "Long-Range Fighter";
		weapon = new Weapon[2];
		weapon[0] = new Weapon("Reinforced Hull", 51, 0.7, Integer.MAX_VALUE);
		weapon[1] = new Weapon("Ballista", 28, 0.5, 7);
	}
}
