import java.util.Scanner;

class Ex4_17{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l:");
		int n = stdIn.nextInt();
		int count = 0; //�񐔂̌��𐔂���ϐ�
		
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("�񐔂�" + count + "�ł��B");
		
	}
}
