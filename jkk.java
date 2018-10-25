public class jkk{
	public static void main(String[] args){
		int a=5;
		for(int i=1;i<a;i++){
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
		for(int k=0;k<a;k++){
			for(int n=0;n<k;n++){
				System.out.print(" ");
			}
			int sta=a-(2*k-3)+1;
			for(int m=0;m<sta;m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}