import java.util.Scanner;

class Ex7_04{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���\�b�hsumUp�̕Ԃ�l��\�����܂��B");
		
		System.out.print("n:");
		int n  = stdIn.nextInt();
		
		System.out.print("�Ԃ�l�F"+ sumUp(n));
	}
	
	static int sumUp(int n){
		if(n < 1){
			return -1;
		} //�G���[�ԋp
		
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
}
