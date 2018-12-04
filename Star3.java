public class Star3{
	public static void main(String[] args){
		int a=7;
		for(int i=0;i<=a;i++){
			for(int j=0;j<=i;j++){	
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=a;i++){
			int kong=a-i;
			for(int k=1;k<=kong;k++){
				System.out.print(" ");
			}
			int star=2*i-1;
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++){
			for(int u=1;u<=a-1;u++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}