import java.util.Scanner;

class Ex4_20{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("®”’lF");
			n = stdIn.nextInt();
		}while(n < 1);
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		
	}
}
