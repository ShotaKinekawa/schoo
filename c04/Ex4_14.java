import java.util.Scanner;

class Ex4_14{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("n‚Ì’l:");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++){
			sum += i;
			System.out.print(i);
			if(i == n){
				System.out.print(" = ");
			}else{
				System.out.print(" + ");
			}
		}
		
		System.out.print(sum);
	}
}
