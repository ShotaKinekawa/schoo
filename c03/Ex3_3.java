import java.util.Scanner;

class Ex3_3{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�����l:");
		int n = stdIn.nextInt();
		
		if(n > 0){
			System.out.println("���̒l�͐��ł��B");
		}else if (n < 0){
			System.out.println("���̒l�͕��ł��B");
		}else if (n == 0){ 
			System.out.println("���̒l��0�ł��B");
		}
		/*�O��2��if����n��0�ȊO�̐��͖ԗ��I�Ɉ����Ă��邱�Ƃ��A
		���w�I�ɕۏႳ��Ă��邽�߁A�Ō��else if (n==0)�ƕς��Ă��A
		���ʂ̉�ʏo�͕͂ς��Ȃ��B
		*/

	}
}
