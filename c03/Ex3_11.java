import java.util.Scanner;

class Ex3_11{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("®”A:");
		int a = stdIn.nextInt();
		
		System.out.print("®”B:");
		int b = stdIn.nextInt();
		
		System.out.println("‚»‚ê‚ç‚Ì·‚Í" + 
			(( a - b <= 10 && a - b >= -10)? "10ˆÈ‰º‚Å‚·B" : "11ˆÈã‚Å‚·B"));
		
	}
}
