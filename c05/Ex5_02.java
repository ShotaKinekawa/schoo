import java.util.Scanner;

class Ex5_02{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ϐ�x��float�^�ŁA�ϐ�y��double�^�ł��B");
		System.out.print("x:");
		float x = stdIn.nextFloat();
		
		System.out.print("y:");
		double y = stdIn.nextDouble();
		
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		
	}
}