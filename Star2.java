public class Star2{
	public static void main(String[] args){
		int a=5;
		for(int i=1;i<=a;i++){
			int sp=a-i;
			for(int j=1;j<=sp;j++){
				System.out.print(" ");
			}
			int star=2*i-1;
			for(int j=1;j<=star;j++)
			if(j==1 || j==star){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}			
			System.out.println();
		}
		for(int i=(a-1);i>=1;i--){
			int sp=a-i;
			for(int j=0;j<sp;j++){
				System.out.print(" ");
			}
			int st=2*i-1;
			for(int j=1;j<=st;j++){
				if(j==1||j==st){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}