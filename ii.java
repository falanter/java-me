public class ii{
 	public static void main(String[] args){
 		re(188,266,7,17);
 		
 	}
 	public static void re(int star,int end,int num1,int num2){
 		int a=0;
 		for(int i=star;i<=end;i++){
 			if(i%num1==0&&i%num2==0){
 				a=i+a;
 			}
 		}
 		System.out.print(a);
 	}
}