package ships;

public class RamShip extends Ship {
	public RamShip(){
		hitpoints = 154;
		armour = 9;
		speed = 40;
		type = "Light Battleship";
		weapon = new Weapon[1];
		weapon[0] = new Weapon("Ram Bow", 75, 0.8, Integer.MAX_VALUE);
	}
}
