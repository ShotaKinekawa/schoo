import java.util.Scanner;

class Ex4_03{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		
		System.out.print("整数B:");
		int b = stdIn.nextInt();
		
		//aの方を小さい値にする
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
