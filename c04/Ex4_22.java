import java.util.Scanner;

class Ex4_22{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("�s���~�b�h��\�����܂��B\n�i���F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		
		int col = (n - 1) * 2 + 1;//��
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < col; j++){
				if(n - i - 1<= j && j <= n + i - 1){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
	}
}
