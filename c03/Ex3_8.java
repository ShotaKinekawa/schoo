import java.util.Scanner;

class Ex3_8{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�_��:");
		int a = stdIn.nextInt();
		
		if ( 0 <= a && a<= 59){
			System.out.println("�s��");
		}else if (60 <= a && a<= 69){
			System.out.println("��");
		}else if (70 <= a && a <= 79){
			System.out.println("��");
		}else if (80 <= a && a <= 100){
			System.out.println("�D");
		}else{
			System.out.println("�s���ȓ��͒l");
		}
		
	}
}
