import java.util.Scanner;

class Ex3_1{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値:");
		int n = stdIn.nextInt();
		
		System.out.print("その絶対値は");
		if (n >= 0){
			System.out.print(n);
		}else{
			System.out.print(-n);
		}
		System.out.print("です。");

	}
}
