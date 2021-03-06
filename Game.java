import java.util.Scanner;

public class game
{
	public static void main(String[] args)
	{
		System.out.println("输入“1”攻击普通僵尸，输入“2”攻击魔法僵尸，输入“3”攻击钢盔僵尸，输入“4”攻击大僵尸。");
		Hunter h=new Hunter("阿什坎迪","金坷垃");
		Monster m=new Monster(1);
		Monster m2=new Monster(2);
		Monster m3=new Monster(3);
		Monster m4=new Monster(4);
		int p=1;
		int y=2;
		int x=3;
		int o=4;
		Scanner haha=new Scanner(System.in);
		while(haha.hasNext()) {
			int v =haha.nextInt();
			if(v==p)
			{
				h.fight(m);
			}else if(v==y)
			{
				h.fight(m2);
			}else if(v==x)
			{
				h.fight(m3);
			}else if(v==o)
			{
				h.fight(m4);
			}
	  }
	}
}
class Hunter
{
	String name;
	int life;
	int maxLife;
	int curLife;
	boolean isLive;
	String weapon;
	int attack;
	int defend;
	int level;
	int exp;
	int agile;
	int hideRate;

	public Hunter(String name,String weapon) {
		this.name=name;
		this.weapon=weapon;
		maxLife=100;
		curLife=maxLife;
		isLive=true;
		attack=90;
		defend=5;
		level=1;
		exp=0;
		agile=35;
		hideRate=60;
	}
	public void fight(Monster monster) {
		if(!isLive) {
			return;
		}
		if(!monster.isLive) {
			return;
		}
		System.out.println(name+"挥舞着"+weapon+"攻击了"+monster.type);
		monster.injured(this);
		show();
	
	}
	public int randomRange(int start,int end) {
		return(int)(Math.random()*(end-start)+start);
	}
	public boolean hidden() {
		int sucRate=agile*hideRate/100;
		int ran=randomRange(1,101);
		if(ran<sucRate) {
			return true;
		}
		return false;
	}
	public void kill(Monster mon) {
		if(hidden()) {
			System.out.println("闪避成功！"+name+"：切，打不到我");
			return;
		}
		int sucRate;
		System.out.println("["+name+":竟然被攻击了"+"]");
		int lostLife=mon.attack-this.defend;
		int lostBasicLife=7;
		if(lostLife<=0) 
		{
			curLife-=lostBasicLife;
		}else 
		{
			curLife-=(lostLife+lostBasicLife);
		}
		if(curLife<=0) 
		{
			dead();
			return;
		}
		
	}
	public void dead() {
		isLive=false;
		System.out.println(name+":noooooooo!");
		System.out.println("gameover");
		life=0;
	}
	public void expAdd(Monster monster) {
		this.exp+=monster.maxLife;
		int needExp=0;
		for(int i=1;i<=level;i++) {
			needExp+=i*50;
		}
		if(exp>=needExp) 
		{
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
	public void show(){
		System.out.println("["+name+",life:"+",curLife:"+curLife+",maxLife:"+maxLife+",attack:"+attack+",defend:"+",weapon:"+weapon+",exp:"+exp+",level:"+level+",isLive:"+isLive+"]");	
	}
}

class Monster
{
	int life;
	String type;
	boolean isLive;
	int attack;
	int defend;
	int maxLife;
	int curLife;
	int agile;
	int hideRate;
	public Monster(int mt) {
		if(mt==1) 
		{
			type="普通僵尸";
			maxLife=200;
			isLive=true;
			attack=15;
			defend=8;
			agile=20;
		}else
		if(mt==2) 
		{
			type="魔法僵尸";
			maxLife=300;
			isLive=true;
			attack=25;
			defend=4;
			agile=30;
		}else
		if(mt==3) 
		{
			type="钢盔僵尸";
			maxLife=500;
			isLive=true;
			attack=15;
			defend=12;
			agile=20;
		}else
		if(mt==4) 
		{
			type="大僵尸";
			maxLife=500;
			isLive=true;
			attack=25;
			defend=22;
			agile=20;
		}
		curLife=maxLife;
	}
	public int randomRange(int start,int end) {
		return(int)(Math.random()*(end-start)+start);
	}
	public boolean hidden() {
		int sucRate=agile*hideRate/100;
		int ran=randomRange(1,101);
		if(ran<sucRate) 
		{
			return true;
		}
		return false;
	}
	public void kill(Monster mon,Hunter hunter) {
		if(hidden())
		{
			System.out.println(hunter.name+"没有打中，"+type+":hahahaha");
			return;
		}
	}
	public void injured(Hunter hunter) {
		System.out.println("["+type+":wowowowo"+"]");
		int lostLife=hunter.attack-this.defend;
		int lostBasicLife=7;
		if(lostLife<=0) 
		{
			curLife-=lostBasicLife;
		}else 
		{
		curLife-=(lostLife+lostBasicLife);
		}
		if(curLife<=0) 
		{
			dead(hunter);
			return;
		}
		show();
		kill(hunter);
	}
	
	public void kill(Hunter hunter){
		if(!isLive) 
		{
			return;
		}
		if(!hunter.isLive) 
		{
			return;
		}
		System.out.println(type+":wuwuwuwuaaa,扑向"+hunter.name);
		hunter.kill(this);
		show();		
		
	}
	public void dead(Hunter hunter) {
		System.out.println("["+type+":aaaaaa"+"]");
		isLive=false;
		life=0;
		hunter.expAdd(this);
		return;
	}
		
	public void show(){
	System.out.println("["+type+",maxLife:"+maxLife+",curLife:"+curLife+",isLive:"+isLive+"]");
	}				
}
