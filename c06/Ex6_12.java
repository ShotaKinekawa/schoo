import java.util.Scanner;
import java.util.Random;

class Ex6_12{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;//�v�f��(�����)
		
		do{
			System.out.print("�v�f���F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		int[] a = new int[n];
		
		System.out.println("�V���b�t���O");
		for(int i = 0; i < n; i++){//�����̗p��
			a[i] = rand.nextInt(n) + 1;
			System.out.println("a[" + i +"]= " + a[i]);
		}
		
		for(int i = 0; i < n; i++){
			int r = rand.nextInt(n - i);
			int tmp = a[r];
			a[r] = a[n - 1 - i];
			a[n - 1 - i] = tmp;
		}
			
		System.out.println("�V���b�t����");
		for(int i = 0; i < n; i++){
			System.out.println("a[" + i +"]= " + a[i]);
		}
	
	}
}
