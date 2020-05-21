import java.util.Scanner;

class Ex3_16{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("®”A:");
		int a = stdIn.nextInt();
		
		System.out.print("®”B:");
		int b = stdIn.nextInt();
		
		System.out.print("®”C:");
		int c = stdIn.nextInt();
		
		int tmp;
		
		if(a > b){
			tmp = b;
			b = a;
			a = tmp;
		}
		if ( b > c ){
			tmp = c;
			c = b;
			b = tmp;
		} //‚±‚±‚Åc‚ªÅ‘å’l‚É‚È‚éB
		
		if(a > b){
			tmp = b;
			b = a;
			a = tmp;
		}
		System.out.println("¸‡:"+ a + "," + b + "," + c);
	}
}
