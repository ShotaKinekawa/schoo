import java.util.Scanner;

class Ex2_5{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.printf("x�̒l:");
		double x = stdIn.nextDouble();
		
		System.out.printf("y�̒l:");
		double y = stdIn.nextDouble();

		
		System.out.println("���v��"+(x+y)+"�ł��B");
		System.out.println("���ς�"+ (x+y)/2 +"�ł��B");

	}
}
