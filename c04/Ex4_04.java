import java.util.Scanner;

class Ex4_04{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		
		do {
			System.out.print("���̐����l:");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		while (x >= 0){
			System.out.println(x);
			x--;
		}
		
		System.out.println("�m�F�I����x�̒l:" + x);
		
	}
}
