package ships;

public class FireShip extends Ship {
	public FireShip(){
		hitpoints = 219;
		armour = 16;
		speed = 40;
		type = "Heavy Battleship";
		weapon = new Weapon[1];
		weapon[0] = new Weapon("Flame Thrower", 82, 0.5, Integer.MAX_VALUE);
	}
}
