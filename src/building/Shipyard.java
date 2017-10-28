package building;

import ships.Marine;
import ships.Research;

public class Shipyard {
	
	private int level = 1;
	public StringBuffer imgPath;
	public Research research = new Research();
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
				this.research.setLvDivingBoat(1);
				if(this.research.getLvMortarShip() == 0) this.research.setLvMortarShip(1);
				if(this.research.getLvSteamRam() == 0) this.research.setLvSteamRam(1);
				if(this.research.getLvPaddleSpeedBoat() == 0) this.research.setLvPaddleSpeedBoat(1);
				if(this.research.getLvRocketShip() == 0) this.research.setLvRocketShip(1);
				if(this.research.getLvTender() == 0) this.research.setLvTender(1);
				if(this.research.getLvBalloonCarrier() == 0) this.research.setLvBalloonCarrier(1);
				if(this.research.getLvFireShip() == 0) this.research.setLvFireShip(1);
				if(this.research.getLvCatapultShip() == 0) this.research.setLvCatapultShip(1);
				if(this.research.getLvBallistaShip() == 0) this.research.setLvBallistaShip(1);
				if(this.research.getLvRamShip() == 0) this.research.setLvRamShip(1);
			}
		}
		else if(level >= 17){
			if(this.level < level){
				this.research.setLvMortarShip(1);
			}
		}
		else if(level >= 15){
			
		}
		else if(level >= 13){
			
		}
		else if(level >= 11){
			
		}
		else if(level >= 9){
			
		}
		else if(level >= 7){
			
		}
		else if(level >= 4){
			
		}
		else if(level >= 3){
			
		}
		else{
			
		}
		this.level = level;
	}
}
