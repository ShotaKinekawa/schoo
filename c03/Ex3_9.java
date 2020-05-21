import java.util.Scanner;

class Ex3_9{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("À”A:");
		double a = stdIn.nextDouble();
		
		System.out.print("À”B:");
		double b = stdIn.nextDouble();
		
		System.out.println("‘å‚«‚¢’l:" + (a < b? b : a));
		
	}
}
