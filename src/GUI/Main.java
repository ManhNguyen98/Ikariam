package GUI;

import building.Shipyard;
import building.Town;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ikariam");
		Town town = new Town(10,"mine",0,0);
		Shipyard shipyard = town.shipyard;
		System.out.println(shipyard.getLevel());
		
	}
}
