import java.util.Scanner;

class Ex7_02{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("メソッドminの返り値を表示します。");
		
		System.out.print("a:");
		int a  = stdIn.nextInt();
		
		System.out.print("b:");
		int b  = stdIn.nextInt();
		
		System.out.print("c:");
		int c  = stdIn.nextInt();
		
		System.out.print("返り値："+ min(a,b,c));
	}
	
	static int min(int a, int b, int c){
		int min = a;
		if(min > b){
			min = b;
		}
		if(min > c){
			min = c;
		}
		return min;
	}
	
}
