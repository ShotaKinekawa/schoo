import java.util.Scanner;

class Ex3_1{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�����l:");
		int n = stdIn.nextInt();
		
		System.out.print("���̐�Βl��");
		if (n >= 0){
			System.out.print(n);
		}else{
			System.out.print(-n);
		}
		System.out.print("�ł��B");

	}
}
