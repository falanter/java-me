public class Exercise{//188到2666能整除7和17前5个数
 	public static void main(String[] args){
 		re(188,2666,7,17);
 	}
 	public static void re(int star,int end,int num1,int num2){
 		int a=0;
 		int o=0;
 		for(int i=star;i<=end;i++){
 			if(i%num1==0&&i%num2==0){
 				a=i+a;
 				o++;
 				if(o==5){
 					break;
 				}
 			}
 		}
 		System.out.print(a);
 	}
}