package building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shipyard {
	
	private int level;
	public StringBuffer imgPath;
	public List<String> shipUnlock;
	
	public Shipyard(){
		level = 1;
		shipUnlock = new ArrayList<String>(Arrays.asList("RamShip"));
	}
	
	public Shipyard(int level){
		shipUnlock = new ArrayList<String>(Arrays.asList("RamShip"));
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
		this.level = level;
		if(level >= 19){
			shipUnlock = new ArrayList<String>(Arrays.asList("DivingBoat","MotarShip","SteamRam","PaddleSpeedboat","RocketShip","Tender","BalloonCarrier","FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 17){
			shipUnlock = new ArrayList<String>(Arrays.asList("MotarShip","SteamRam","PaddleSpeedboat","RocketShip","Tender","BalloonCarrier","FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 15){
			shipUnlock = new ArrayList<String>(Arrays.asList("SteamRam","PaddleSpeedboat","RocketShip","Tender","BalloonCarrier","FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 13){
			shipUnlock = new ArrayList<String>(Arrays.asList("PaddleSpeedboat","RocketShip","Tender","BalloonCarrier","FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 11){
			shipUnlock = new ArrayList<String>(Arrays.asList("RocketShip","Tender","BalloonCarrier","FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 9){
			shipUnlock = new ArrayList<String>(Arrays.asList("Tender","BalloonCarrier","FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 7){
			shipUnlock = new ArrayList<String>(Arrays.asList("BalloonCarrier","FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 4){
			shipUnlock = new ArrayList<String>(Arrays.asList("FireShip","CatapultShip","BallistaShip","RamShip"));
		}
		else if(level >= 3){
			shipUnlock = new ArrayList<String>(Arrays.asList("CatapultShip","BallistaShip","RamShip"));
		}
		else{
			shipUnlock = new ArrayList<String>(Arrays.asList("RamShip"));
		}
	}
}
