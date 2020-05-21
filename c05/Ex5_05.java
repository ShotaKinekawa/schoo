import java.util.Scanner;

class Ex5_05{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数値A,B,Cの合計と平均を表示します。");
		
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		
		System.out.print("整数B:");
		int b = stdIn.nextInt();
		
		System.out.print("整数C:");
		int c = stdIn.nextInt();
		
		int sum = a + b + c;
		System.out.println("合計は" + sum);
		System.out.println("平均は" + (double)sum / 3);
	}
}
