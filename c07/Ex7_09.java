import java.util.Scanner;

class Ex7_09{
	public static void main(String[] args){
		
		System.out.println("���\�b�hreadPlusInt�̕Ԃ�l��\�����܂��B");
		
		int r = readPlusInt();
		
		System.out.print("�Ԃ�l�F"+ r);
	}
	
	static int readPlusInt(){
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("���̐����l�F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		return n;
	}
}
