import java.util.Scanner;

class Ex4_18{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("n�̒l:");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		
		for(int i = 1; i <= n; i++){
			System.out.println(i + "��2���" + i * i);
		}
	}
}
