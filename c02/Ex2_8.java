import java.util.Random;
import java.util.Scanner;

class Ex2_8{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.printf("�����l:");
		int x = stdIn.nextInt();
		
		Random rand = new Random();
		int r = rand.nextInt(11);//0~10�̐�������
		r = r - 5; //�͈�-5~+5
		
		System.out.println("���̒l�́}5�̗����𐶐����܂����B�����"
			+ (x+r) );
	}
}
