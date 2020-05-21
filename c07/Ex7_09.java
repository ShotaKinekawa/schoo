import java.util.Scanner;

class Ex7_09{
	public static void main(String[] args){
		
		System.out.println("メソッドreadPlusIntの返り値を表示します。");
		
		int r = readPlusInt();
		
		System.out.print("返り値："+ r);
	}
	
	static int readPlusInt(){
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("正の整数値：");
			n = stdIn.nextInt();
		}while(n < 1);
		
		return n;
	}
}
