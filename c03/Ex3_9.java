import java.util.Scanner;

class Ex3_9{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("実数A:");
		double a = stdIn.nextDouble();
		
		System.out.print("実数B:");
		double b = stdIn.nextDouble();
		
		System.out.println("大きい値:" + (a < b? b : a));
		
	}
}
