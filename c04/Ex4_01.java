import java.util.Scanner;

class Ex4_01{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int retry = 1;
		
		do{
			System.out.print("�����l:");
			int n = stdIn.nextInt();
		
			if(n > 0){
				System.out.println("���̒l�͐��ł��B");
			}else if (n < 0){
				System.out.println("���̒l�͕��ł��B");
			}else{ 
				System.out.println("���̒l��0�ł��B");
			}
			
			System.out.print("������x�H 1�cYes/ 0�cNo :");
			retry = stdIn.nextInt();
			System.out.println();
			
		}while(retry == 1);
		

	}
}