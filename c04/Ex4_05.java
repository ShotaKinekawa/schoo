import java.util.Scanner;

class Ex4_05{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("カウントダウンします。");
		int x;
		
		do {
			System.out.print("正の整数値:");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		while (x >= 0){
			System.out.println(--x); //最初x-1を、最後-1を出力して終了
		}
		
	}
}
