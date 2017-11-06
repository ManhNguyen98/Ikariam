package building;

import GUI.Marine;

public class Shipyard {
	
	private int level = 1;
	public StringBuffer imgPath;
	public Marine mainMarine = new Marine();
	
	public Shipyard(){
		setLevel(1);
	}
	
	public Shipyard(int level){
		setLevel(level);
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		// imgPath change when level change
		if(level <= 0) {
			level = 1;
			System.out.println("Level Shipyard must be greater than 0!");
		}
		if(level >= 19){
			if(this.level < level){
				mainMarine.research.setLvDivingBoat(1);
				if(mainMarine.research.getLvMortarShip() == 0) mainMarine.research.setLvMortarShip(1);
				if(mainMarine.research.getLvSteamRam() == 0) mainMarine.research.setLvSteamRam(1);
				if(mainMarine.research.getLvPaddleSpeedBoat() == 0) mainMarine.research.setLvPaddleSpeedBoat(1);
				if(mainMarine.research.getLvRocketShip() == 0) mainMarine.research.setLvRocketShip(1);
				if(mainMarine.research.getLvTender() == 0) mainMarine.research.setLvTender(1);
				if(mainMarine.research.getLvBalloonCarrier() == 0) mainMarine.research.setLvBalloonCarrier(1);
				if(mainMarine.research.getLvFireShip() == 0) mainMarine.research.setLvFireShip(1);
				if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
				if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
				if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
			}
		}
		else if(level >= 17){
			if(this.level < level){
				mainMarine.research.setLvMortarShip(1);
				if(mainMarine.research.getLvSteamRam() == 0) mainMarine.research.setLvSteamRam(1);
				if(mainMarine.research.getLvPaddleSpeedBoat() == 0) mainMarine.research.setLvPaddleSpeedBoat(1);
				if(mainMarine.research.getLvRocketShip() == 0) mainMarine.research.setLvRocketShip(1);
				if(mainMarine.research.getLvTender() == 0) mainMarine.research.setLvTender(1);
				if(mainMarine.research.getLvBalloonCarrier() == 0) mainMarine.research.setLvBalloonCarrier(1);
				if(mainMarine.research.getLvFireShip() == 0) mainMarine.research.setLvFireShip(1);
				if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
				if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
				if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
			}
		}
		else if(level >= 15){
			mainMarine.research.setLvSteamRam(1);
			if(mainMarine.research.getLvPaddleSpeedBoat() == 0) mainMarine.research.setLvPaddleSpeedBoat(1);
			if(mainMarine.research.getLvRocketShip() == 0) mainMarine.research.setLvRocketShip(1);
			if(mainMarine.research.getLvTender() == 0) mainMarine.research.setLvTender(1);
			if(mainMarine.research.getLvBalloonCarrier() == 0) mainMarine.research.setLvBalloonCarrier(1);
			if(mainMarine.research.getLvFireShip() == 0) mainMarine.research.setLvFireShip(1);
			if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
			if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
			if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
		}
		else if(level >= 13){
			mainMarine.research.setLvPaddleSpeedBoat(1);
			if(mainMarine.research.getLvRocketShip() == 0) mainMarine.research.setLvRocketShip(1);
			if(mainMarine.research.getLvTender() == 0) mainMarine.research.setLvTender(1);
			if(mainMarine.research.getLvBalloonCarrier() == 0) mainMarine.research.setLvBalloonCarrier(1);
			if(mainMarine.research.getLvFireShip() == 0) mainMarine.research.setLvFireShip(1);
			if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
			if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
			if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
		}
		else if(level >= 11){
			mainMarine.research.setLvRocketShip(1);
			if(mainMarine.research.getLvTender() == 0) mainMarine.research.setLvTender(1);
			if(mainMarine.research.getLvBalloonCarrier() == 0) mainMarine.research.setLvBalloonCarrier(1);
			if(mainMarine.research.getLvFireShip() == 0) mainMarine.research.setLvFireShip(1);
			if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
			if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
			if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
		}
		else if(level >= 9){
			mainMarine.research.setLvTender(1);
			if(mainMarine.research.getLvBalloonCarrier() == 0) mainMarine.research.setLvBalloonCarrier(1);
			if(mainMarine.research.getLvFireShip() == 0) mainMarine.research.setLvFireShip(1);
			if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
			if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
			if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
		}
		else if(level >= 7){
			mainMarine.research.setLvBalloonCarrier(1);
			if(mainMarine.research.getLvFireShip() == 0) mainMarine.research.setLvFireShip(1);
			if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
			if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
			if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
		}
		else if(level >= 4){
			mainMarine.research.setLvFireShip(1);
			if(mainMarine.research.getLvCatapultShip() == 0) mainMarine.research.setLvCatapultShip(1);
			if(mainMarine.research.getLvBallistaShip() == 0) mainMarine.research.setLvBallistaShip(1);
			if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
		}
		else if(level >= 3){
			mainMarine.research.setLvCatapultShip(1);
			mainMarine.research.setLvBallistaShip(1);
			if(mainMarine.research.getLvRamShip() == 0) mainMarine.research.setLvRamShip(1);
		}
		else {
			mainMarine.research.setLvRamShip(1);
		}
		this.level = level;
	}
}
