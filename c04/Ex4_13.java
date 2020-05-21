import java.util.Scanner;

class Ex4_13{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1‚©‚çn‚Ü‚Å‚Ì˜a‚ğ‹‚ß‚Ü‚·B");
		int n;
		
		do {
			System.out.print("n‚Ì’l:");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		
		System.out.println("1‚©‚ç" + n + "‚Ü‚Å‚Ì˜a‚Í" + sum + "‚Å‚·B");
	}
}
