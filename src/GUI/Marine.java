package GUI;


public class Marine {
	public int totalNumShip;
	public int nBallistaShip;
	public int nBalloonCarrier;
	public int nCatapultShip;
	public int nDivingBoat;
	public int nFireShip;
	public int nMortarShip;
	public int nPaddleSpeedBoat;
	public int nRamShip;
	public int nRocketShip;
	public int nSteamRam;
	public int nTender;
	public boolean isLo = false, isColossus = false, isDolphin = false;	
	public Research research = new Research();
	
	public Marine(){
		totalNumShip = nBallistaShip = nBalloonCarrier = nCatapultShip = nDivingBoat = nFireShip = nMortarShip = nPaddleSpeedBoat = nRamShip = nRocketShip = nSteamRam = nTender;
	}
	
	public Marine(int nBallistaShip, int nBalloonCarrier, int nCatapultShip, int nDivingBoat, int nFireShip, int nMortarShip, int nPaddleSpeedBoat, int nRamShip, int nRocketShip, int nSteamRam, int nTender) {
		this.totalNumShip = nBallistaShip + nBalloonCarrier + nCatapultShip + nDivingBoat + nFireShip + nMortarShip + nPaddleSpeedBoat + nRamShip + nRocketShip + nSteamRam + nTender;
		this.nBallistaShip = nBallistaShip;
		this.nBalloonCarrier = nBalloonCarrier;
		this.nCatapultShip = nCatapultShip;
		this.nDivingBoat = nDivingBoat;
		this.nFireShip = nFireShip;
		this.nMortarShip = nMortarShip;
		this.nPaddleSpeedBoat = nPaddleSpeedBoat;
		this.nRamShip = nRamShip;
		this.nRocketShip = nRocketShip;
		this.nSteamRam = nSteamRam;
		this.nTender = nTender;
	}
	
	
}
