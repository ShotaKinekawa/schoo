import java.util.Scanner;

class Ex6_13{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;//�v�f��(�����)
		
		do{
			System.out.print("�v�f���F");//�v�f���ǂݍ���
			n = stdIn.nextInt();
		}while(n < 1);
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		
		for (int i = 0 ; i < n; i++){
			System.out.print("a[" + i + "] = " );//�z��a�̒l�ǂݍ���
			a[i] = stdIn.nextInt();
			b[n - 1 - i] = a[i]; //�z��b�ɋt���R�s�[
		}
		
		System.out.println("a�̑S�v�f��b�ɃR�s�[���܂����B");
		for(int i = 0; i < n; i++){
			System.out.println("b[" + i + "] = " + b[i] );//b[i]�\��
		}
	
	}
}
