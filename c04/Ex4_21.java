import java.util.Scanner;

class Ex4_21{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���p�O�p�`��\�����܂��B\n�i���F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		System.out.println("���㒼�p�̎O�p�`��\�����܂��B");
		for(int i = n; i > 0; i--){
			for(int j = i; j > 0; j--){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("�E�����p�̎O�p�`��\�����܂��B");
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(j >= n - i + 1){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("�E�㒼�p�̎O�p�`��\�����܂��B");
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i <= j){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
	}
}
