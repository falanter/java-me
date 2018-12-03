package mayGame2;


public class Mon extends allBad {
	
	public Mon(int mt) {
		if(mt==1) {
			this.setType("ÆÕÍ¨½©Ê¬");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
		}else
		if(mt==2) {
			this.setType("Ä§·¨½©Ê¬");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
		}else
		if(mt==3) {
			this.setType("¸Ö¿ø½©Ê¬");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
		}else
		if(mt==4) {
			this.setType("´ó½©Ê¬");
			this.setMaxLife(55);
			this.setCurLife(this.getMaxLife());
			this.setAttack(33);
			this.setDefend(5);
			this.setHideRate(50);
			this.setLive(true);
			this.setAgile(40);
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
	}
}
