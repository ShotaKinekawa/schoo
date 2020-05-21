import java.util.Scanner;

class Ex3_12{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("®”A:");
		int a = stdIn.nextInt();
		
		System.out.print("®”B:");
		int b = stdIn.nextInt();
		
		System.out.print("®”C:");
		int c = stdIn.nextInt();
		
		int min = a;
		
		if (min > b){
			min = b;
		}
		if (min > c){
			min = c;
		}
		System.out.println("Å¬’l:" + min );
	}
}
