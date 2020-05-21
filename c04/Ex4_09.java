import java.util.Scanner;

class Ex4_09{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("n‚Ì’l:");
			n = stdIn.nextInt();
		}while (n <= 0);
		
		int i = 0;
		int p = 1;
		
		while (i < n){
			i++;
			p *= i;
		}
		System.out.println("1‚©‚ç"+ n +"‚Ü‚Å‚ÌÏ‚Í" + p + "‚Å‚·B");
		
	}
}
