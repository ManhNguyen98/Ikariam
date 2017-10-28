package ships;

public class CatapultShip extends Ship {
	public CatapultShip(){
		hitpoints = 148;
		armour = 10;
		speed = 40;
		type = "Long-Range Fighter";
		weapon = new Weapon[2];
		weapon[0] = new Weapon("Oil Jug", 45, 0.3, 6);
		weapon[1] = new Weapon("Hull", 31, 0.7, Integer.MAX_VALUE);
	}
}
