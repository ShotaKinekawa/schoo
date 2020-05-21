import java.util.Scanner;

class Ex7_07{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("左下直角の三角形を表示します。");
		int n;
		do{
			System.out.print("段数は:");
			n  = stdIn.nextInt();
		}while(n < 1);
		
		for(int i = 1; i <= n; i++){
			putChars('*', i);
			System.out.println();
		}
		
	}
	
	static void putChars(char c, int i){
		while(i-- > 0){
			System.out.print(c);
		}
	}
}
