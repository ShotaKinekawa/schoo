import java.util.Scanner;

class Ex3_11{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����A:");
		int a = stdIn.nextInt();
		
		System.out.print("����B:");
		int b = stdIn.nextInt();
		
		System.out.println("�����̍���" + 
			(( a - b <= 10 && a - b >= -10)? "10�ȉ��ł��B" : "11�ȏ�ł��B"));
		
	}
}
