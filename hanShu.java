public class hanShu{
		public static void main(String[] args){
			int w=50;
			int h=30;
			int p=Pe(w,h);
			int a=Pr(w,h);
			System.out.println("面积"+a);
			System.out.println("周长"+p);
			Gr(5);
			}
		public static int Ar(int width,int height){
			return width*height;
		}
		public static int Pe(int width,int height){
			return 2*(width+height);
		}
		public static void Gr(int a) {
			for(int i=1;i<=a;i++){
				int sp=a-i;
				for(int j=1;j<=sp;j++){
					System.out.print(" ");
				}
				int star=2*i-1;
				for(int j=1;j<=star;j++){
					if(j==1 || j==star){
						System.out.print("*");
						
					}else{
						System.out.print(" ");
					}		
				}	
				System.out.println();
			}
		}
}