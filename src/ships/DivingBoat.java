package ships;

public class DivingBoat extends Ship{
	public DivingBoat(){
		hitpoints = 110;
		armour = 6;
		speed = 40;
		type = "First Strike Ship";
		weapon = new Weapon[2];
		weapon[0] = new Weapon("Floating Bomb", 123, 0.8, 4);
		weapon[1] = new Weapon("Reinforce Hull", 90, 0.8, Integer.MAX_VALUE);
	}
}
