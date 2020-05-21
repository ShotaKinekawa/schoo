import java.util.Scanner;

class Ex4_01{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int retry = 1;
		
		do{
			System.out.print("整数値:");
			int n = stdIn.nextInt();
		
			if(n > 0){
				System.out.println("その値は正です。");
			}else if (n < 0){
				System.out.println("その値は負です。");
			}else{ 
				System.out.println("その値は0です。");
			}
			
			System.out.print("もう一度？ 1…Yes/ 0…No :");
			retry = stdIn.nextInt();
			System.out.println();
			
		}while(retry == 1);
		

	}
}
