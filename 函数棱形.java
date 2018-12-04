public class Á·Ï°{
	public static void main(String[] args){	
		re(6);
	}
	public static void re(int a){
		for(int i=1;i<=a;i++){
			int kong=a-i;
			for(int j=0;j<kong;j++){
				System.out.print(" ");
			}
			int star=2*i-1;
			for(int j=0;j<star;j++){
				System.out.print("*");
			}
			System.out.println();
		} 
		for(int i=a-1;i>=1;i--){
			int kong=a-i;
			for(int j=0;j<kong;j++){
				System.out.print(" ");
			}
			int sta=2*i-1;
			for(int m=0;m<sta;m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
