package ships;

public class PaddleSpeedBoat extends Ship {
	public PaddleSpeedBoat(){
		hitpoints = 20;
		armour = Integer.MAX_VALUE;
		speed = 60;
		type = "Carrier Ship Evasion Ship";
		weapon = new Weapon[1];
		weapon[0] = new Weapon("Ballista", 12, 0.9, 5);
	}
}
