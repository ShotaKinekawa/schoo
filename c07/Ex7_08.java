import java.util.Scanner;
import java.util.Random;

class Ex7_08{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���\�b�hrandom�̕Ԃ�l��\�����܂��B");
		
		System.out.print("a:");
		int a  = stdIn.nextInt();
		
		System.out.print("b:");
		int b  = stdIn.nextInt();
		
		System.out.print("�Ԃ�l�F"+ random(a,b));
	}
	
	static int random(int a, int b){
		
		if(b <= a){
			return a;
		}
		
		Random rand = new Random();
		return rand.nextInt(b - a + 1) + a;
		
	}
}
