import java.util.Scanner;

class Ex5_05{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�����lA,B,C�̍��v�ƕ��ς�\�����܂��B");
		
		System.out.print("����A:");
		int a = stdIn.nextInt();
		
		System.out.print("����B:");
		int b = stdIn.nextInt();
		
		System.out.print("����C:");
		int c = stdIn.nextInt();
		
		int sum = a + b + c;
		System.out.println("���v��" + sum);
		System.out.println("���ς�" + (double)sum / 3);
	}
}
