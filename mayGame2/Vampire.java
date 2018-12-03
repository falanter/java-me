package mayGame2;

public class Vampire extends allBad {
	
	public Vampire(int mt) {
		if(mt==6) {
			this.setType("ÎüÑªòùòð");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
			this.setGetLife(1);
		}else
		if(mt==7) {
			this.setType("Ñª×å");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
			this.setGetLife(2);
		}else
		if(mt==8) {
			this.setType("ÎüÑª¹í");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
			this.setGetLife(3);
		}else
		if(mt==9) {
			this.setType("ÎüÑª¹íÍõ");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
			this.setGetLife(4);
		}
	}
	public void kill(People pp) {
		if(!this.isLive()) {
			return;
		}
		if(!pp.isLive()) {
			return;
		}
		pp.rekill(this);
		getLife();
	}
	
}