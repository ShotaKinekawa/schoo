import java.util.Scanner;

class Ex3_14{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����A:");
		int a = stdIn.nextInt();
		
		System.out.print("����B:");
		int b = stdIn.nextInt();
		
		
		int min, max;
		
		if(a < b){
			min = a;
			max = b;
		}else{
			min = b;
			max = a;
		}
		
		if(min == max){
			System.out.println("2�̒l�͓����ł��B");
		}else{
			System.out.println("���������̒l��" + min + "�ł��B");
			System.out.println("�傫�����̒l��" + max + "�ł��B");
		}
	}
}
