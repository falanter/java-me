package mayGame2;
import java.util.Scanner;


public class Game {
	
	public static void main(String[] args) {
		System.out.println("���롰a��������ͨ��ʬ�����롰s������ħ����ʬ�����롰d�������ֿ���ʬ�����롰f��������ʬ,���롰h��������Ѫ�������롰j������Ѫ�壬���롰k��������Ѫ�����롰l��������Ѫ������");
		People p=new People("��������","�����");
		
		Mon m = new Mon(1);
		Mon m2 = new Mon(2);
		Mon m3 = new Mon(3);
		Mon m4 = new Mon(4);
		String x=new String("a");
		String y=new String("s");
		String z=new String("d");
		String o=new String("f");
		
		comMon cm=new comMon();
		
		Vampire vaa=new Vampire(6);
		Vampire vab=new Vampire(7);
		Vampire vac=new Vampire(8);
		Vampire vad=new Vampire(9);
		String xa=new String("h");
		String ya=new String("j");
		String za=new String("k");
		String oa=new String("l");
	
		Scanner haha=new Scanner(System.in);
		while(haha.hasNext()) {
			
			String u=haha.next();
			
			if(x.equals(u)) {
				p.fight(m);
			}else if(y.equals(u))
			{
				p.fight(m2);
			}else if(z.equals(u))
			{
				p.fight(m3);
			}else if(o.equals(u)) 
			{
				p.fight(m4);
			}else if(xa.equals(u))
			{
				p.fight(vaa);
			}else if(ya.equals(u))
			{
				p.fight(vab);
			}else if(za.equals(u)) 
			{
				p.fight(vac);
			}else if(oa.equals(u)) 
			{
				p.fight(vad);
			}
		}
	}
}