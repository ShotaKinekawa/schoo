import java.util.Scanner;

class Ex3_8{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("点数:");
		int a = stdIn.nextInt();
		
		if ( 0 <= a && a<= 59){
			System.out.println("不可");
		}else if (60 <= a && a<= 69){
			System.out.println("可");
		}else if (70 <= a && a <= 79){
			System.out.println("良");
		}else if (80 <= a && a <= 100){
			System.out.println("優");
		}else{
			System.out.println("不正な入力値");
		}
		
	}
}
