import java.util.Scanner;

class Ex2_6{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂��B");
		System.out.printf("���:");
		double l = stdIn.nextDouble();
		
		System.out.printf("����:");
		double h = stdIn.nextDouble();

		
		System.out.println("�ʐς�"+ l*h/2 +"�ł��B");

	}
}
