import java.util.Scanner;

class Ex7_01{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("signOf�̕Ԃ�l��\�����܂��B\n�����F");
		int d  = stdIn.nextInt();
		System.out.print("�Ԃ�l�F"+ signOf(d));
	}
	
	static int signOf(int n){
		if(n < 0){
			return -1;
		}else if(n > 0){
			return 1;
		}
		
		return 0;
	}
}
