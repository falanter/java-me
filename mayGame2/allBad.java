package mayGame2;

public abstract class allBad {
	private int life;
	private String type;
	private boolean isLive;
	private int attack;
	private int defend;
	private int maxLife;
	private int curLife;
	private int agile;
	private int hideRate;
	private int getLife;
	
	public abstract void kill(People pp);
	
	
	public void show()
	{
	System.out.println("["+type+",maxLife:"+maxLife+",curLife:"+curLife+",isLive:"+isLive+"]");
	}	
	public boolean hidden() {
		return textGame.isHidden(getAgile(),getHideRate());
	}
	public void hurt(People pp) {
		if(hidden())
		{
		System.out.println(pp.getName()+"没有打中，"+type+":hahahaha");
		
		}else {
			
			curLife-=textGame.lostLife(pp.getAttack(),this.defend);
			if(curLife<=0) {
				dead(pp);
				return;
			
			}
			System.out.println("["+type+":wowowowo"+"]");
		}
		System.out.println(type+":wuwuwuwuaaa,扑向"+pp.getName());
		kill(pp);
		show();		
	}
	public void dead(People pp) {
		System.out.println("["+type+":aaaaaa"+"]");
		isLive=false;
		curLife=0;
		pp.expAdd(this);
		return;
	}
	public void gitLife() {
		curLife+=getLife;
	}
	
	public int getGetLife() {
		return getLife;
	}

	public void setGetLife(int getLife) {
		this.getLife = getLife;
	}

	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isLive() {
		return isLive;
	}
	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefend() {
		return defend;
	}
	public void setDefend(int defend) {
		this.defend = defend;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurLife() {
		return curLife;
	}
	public void setCurLife(int curLife) {
		this.curLife = curLife;
	}
	public int getAgile() {
		return agile;
	}
	public void setAgile(int agile) {
		this.agile = agile;
	}
	public int getHideRate() {
		return hideRate;
	}
	public void setHideRate(int hideRate) {
		this.hideRate = hideRate;
	}
}
