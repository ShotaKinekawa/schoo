import java.util.Scanner;

class Ex4_26{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���������Z���܂��B\n�����Z���܂����F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++){
			System.out.print("�����F");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("���̐��͉��Z���܂���");
				continue;
			}
			
			sum += t;
			count++;
		}
		
		System.out.println("���v��" + sum + "�ł��B");
		if(count > 0){
			System.out.println("���ς�" + (double) sum / count + "�ł��B");
		}else{
			System.out.println("���ς�0�ł��B");
		}
		
	}
}
