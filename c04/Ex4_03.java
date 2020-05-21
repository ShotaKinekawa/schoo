import java.util.Scanner;

class Ex4_03{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”A:");
		int a = stdIn.nextInt();
		
		System.out.print("®”B:");
		int b = stdIn.nextInt();
		
		//a‚Ì•û‚ð¬‚³‚¢’l‚É‚·‚é
		if (a > b){
			int tmp = b;
			b = a;
			a = tmp;
		}
		
		int i = a;
		do{
			System.out.print(i + " ");
			i++;
		}while(i<=b);
	}
}
