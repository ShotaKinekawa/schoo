import java.util.Scanner;

class Ex3_3{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値:");
		int n = stdIn.nextInt();
		
		if(n > 0){
			System.out.println("その値は正です。");
		}else if (n < 0){
			System.out.println("その値は負です。");
		}else if (n == 0){ 
			System.out.println("その値は0です。");
		}
		/*前の2つのif文でnが0以外の数は網羅的に扱えていることが、
		数学的に保障されているため、最後をelse if (n==0)と変えても、
		結果の画面出力は変わらない。
		*/

	}
}
