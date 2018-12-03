package mayGame2;

public class comMon extends allBad{
	
	public comMon() {
		this.setType("≈£Õ∑»À");
		this.setMaxLife(55);
		this.setCurLife(this.getMaxLife());
		this.setAttack(33);
		this.setDefend(5);
		this.setHideRate(50);
		this.setLive(true);
		this.setAgile(40);
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
