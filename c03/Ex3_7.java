import java.util.Scanner;

class Ex3_7{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���̐���:");
		int a = stdIn.nextInt();
		
		
		if (a <= 0){
			System.out.println("���łȂ��l�����͂���܂����B");
		}else{
			int r = a % 3;
			
			if (r == 0){
				System.out.println("���̒l��3�Ŋ���؂�܂��B");
			}else{
				System.out.println("���̒l��3�Ŋ������]���"+ r +"�ł��B");
			}
		}
	}
}
