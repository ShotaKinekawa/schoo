import java.util.Random;
import java.util.Scanner;

class Ex4_02{
	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int number = rand.nextInt(90);//0~89�̗����l
		number += 10; //10~99�̗����l(�����̒l)
		
		int ans;//�𓚗p
		
		System.out.print
		("�����ăQ�[���J�n�I�I\n10�`99�̐��𓖂ĂĂ��������I\n");
		
		do{
			System.out.print("�������ȁH:");
			 ans = stdIn.nextInt();
			
			if (ans > number){
				System.out.println("�����Ə����Ȓl����I");
			}else if(ans < number){
				System.out.println("�����Ƒ傫�Ȓl����I");
			}
			
		}while(ans != number);
		
		System.out.println("�����ł��I�����l�ł����B");

	}
}
