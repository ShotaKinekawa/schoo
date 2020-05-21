import java.util.Scanner;

class Ex7_03{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("メソッドmedの返り値を表示します。");
		
		System.out.print("a:");
		int a  = stdIn.nextInt();
		
		System.out.print("b:");
		int b  = stdIn.nextInt();
		
		System.out.print("c:");
		int c  = stdIn.nextInt();
		
		System.out.print("返り値："+ med(a,b,c));
	}
	
	static int med(int a, int b, int c){
		if((a <= b && b <= c) || (c <= b && b <= a)){
			return b;
		}else if((b <= c && c <= a ) || (a <= c && c <= b)){
			return c;
		}else{
			return a;
		}
	}
}
