import java.util.Scanner;

class Ex3_2{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		
		System.out.print("整数B:");
		int b = stdIn.nextInt();
		
		System.out.print("BはAの約数");
		if(a%b==0){
			System.out.print("です。");
		}else{
			System.out.print("ではありません。");
		}

	}
}
