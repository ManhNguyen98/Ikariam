package ships;

public class SteamRam extends Ship{
	public SteamRam(){
		hitpoints = 576;
		armour = 16;
		speed = 40;
		type = "Heavy Battleship";
		weapon = new Weapon[1];
		weapon[0] = new Weapon("Massive Ram", 166, 0.9, Integer.MAX_VALUE);
	}
}
