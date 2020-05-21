import java.util.Scanner;

class Ex4_08{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		int x;
		do{
			System.out.print("®”’l:");
			x = stdIn.nextInt();
		}while (x <= 0);
		
		int dig = 0;
		
		while (x > 0){
			dig++;
			x /= 10;
		}
		System.out.println("‚»‚Ì’l‚Í" + dig + "Œ…‚Å‚·B");
		
	}
}
