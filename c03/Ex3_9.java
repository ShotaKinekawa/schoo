import java.util.Scanner;

class Ex3_9{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����A:");
		double a = stdIn.nextDouble();
		
		System.out.print("����B:");
		double b = stdIn.nextDouble();
		
		System.out.println("�傫���l:" + (a < b? b : a));
		
	}
}
