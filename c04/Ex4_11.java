import java.util.Scanner;

class Ex4_11{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		
		do {
			System.out.print("���̐����l:");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		for (int i = x; i >= 0; i--){
			System.out.println(i);
		}
		
	}
}