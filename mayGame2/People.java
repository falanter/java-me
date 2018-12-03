package mayGame2;




public class People {
	private String name;
	private int maxLife;
	private int curLife;
	private String weapon;
	private boolean isLive;
	
	
	private int attack;
	private int defend;
	
	private int level;
	private int exp;
	
	//敏捷
	private int agile;
	//闪避
	private int hideRate;
	
	public People(String name, String weapon) {
		this.name=name;
		this.weapon=weapon;
		maxLife=100;
		curLife=maxLife;
		isLive=true;
		attack=25;
		defend=8;
		level=1;
		exp=0;
		agile=16;
		hideRate=60;
	}
	public void fight(allBad mon) {
		if(!isLive) {
			return;
		}
		if(!mon.isLive()) {
			return;
		}
		System.out.println(name+"挥舞着"+weapon+"攻击了"+mon.getType());
		mon.hurt(this);
		show();
	
		
	}
	
	public boolean hidden() {
		return textGame.isHidden(agile,hideRate);
	}
	public void rekill(allBad m) {
		if(hidden()) {
			System.out.println("闪避成功！"+name+"：切，打不到我");
			show();
			return;
		}
		curLife-=textGame.lostLife(m.getAttack(),this.defend);
		System.out.println("["+name+":竟然被攻击了"+"]");
		if(curLife<=0) {
			dead();
			show();
			return;
		}
		
		}
	public void dead() {
		isLive=false;
		System.out.println(name+":noooooooo!");
		System.out.println("gameover");
		curLife=0;
	}
	public void expAdd(allBad m) {
		this.exp+=m.getMaxLife();
		int needExp=0;
		for(int i=1;i<=level;i++) {
			needExp+=i*50;
		}
		if(exp>=needExp) {
			this.upgrade();
		}
	}
	public void upgrade() {
		System.out.println("当当当！"+name+"level up!");
		attack+=4;
		defend+=3;
		maxLife+=70;
		curLife=maxLife;
		level+=1;
	}
	public void show()
	{
		System.out.println("["+name+",life:"+",curLife:"+curLife+",maxLife:"+maxLife+",attack:"+attack+",defend:"+defend+",weapon:"+weapon+",exp:"+exp+",level:"+level+",isLive:"+isLive+"]");	
	}
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public boolean isLive() {
		return isLive;
	}
	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}
	public int getDefend() {
		return defend;
	}
	public void setDefend(int defend) {
		this.defend = defend;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
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
