import java.util.Scanner;

class Ex3_18{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("月:");
		int month = stdIn.nextInt();
		
		switch (month){
			
			case 12 :	
			case 1 :	
			case 2 :	System.out.println("冬です。");
						break;
			
			case 3:
			case 4:
			case 5:		System.out.println("春です。");
						break;
			
			case 6 :
			case 7:
			case 8:		System.out.println("夏です。");
						break;
			
			case 9:
			case 10:
			case 11:	System.out.println("秋です。");
						break;
			
			default :	System.out.println("不正な入力値です。");
						break;
			
		}
		
	}
}
