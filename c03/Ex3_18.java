import java.util.Scanner;

class Ex3_18{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��:");
		int month = stdIn.nextInt();
		
		switch (month){
			
			case 12 :	
			case 1 :	
			case 2 :	System.out.println("�~�ł��B");
						break;
			
			case 3:
			case 4:
			case 5:		System.out.println("�t�ł��B");
						break;
			
			case 6 :
			case 7:
			case 8:		System.out.println("�Ăł��B");
						break;
			
			case 9:
			case 10:
			case 11:	System.out.println("�H�ł��B");
						break;
			
			default :	System.out.println("�s���ȓ��͒l�ł��B");
						break;
			
		}
		
	}
}
