import java.util.Random;
import java.util.Scanner;

class Ex4_27{
	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int number = rand.nextInt(100);//���Ă�ׂ����F0~99�̗����l
		int ans;//�𓚗p
		int times = 5;//�𓚉�
		
		System.out.print
		("�����ăQ�[���J�n�I�I\n0�`99�̐��𓖂ĂĂ��������I\n");
		
		do{
			System.out.print("�������ȁH(�𓚌��c��"+ times +"��):");
			ans = stdIn.nextInt();
			times--;
			if(times == 0){
				System.out.println("�c�O�I������"+ number +"�ł����B");
				break;
			}
			
			if (ans > number){
				System.out.println("�����Ə����Ȓl����I");
			}else if(ans < number){
				System.out.println("�����Ƒ傫�Ȓl����I");
			}else{
				System.out.println("�����ł��I�����l�ł����B");
				break;
			}
			
		}while(ans != number);
		

	}
}
