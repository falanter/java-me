package mayGame2;


public class textGame {
	public static boolean isHidden(int agile,int hideRate) {
		int sucRate=agile*hideRate/100;
		int ran=randomRange(1,101);
		if(ran<sucRate) {
			return true;
		}
		return false;
	}
	public static int randomRange(int start,int end) {
		return(int)(Math.random()*(end-start)+start);
	}
	public static int lostLife(int atk,int def) {
		int tureLife=8;
		if(atk<=def) {
			return tureLife;
		}
		int lost=atk-def+tureLife;
		return lost;

	}
	

	
}