import java.util.Scanner;

class Ex2_10{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.printf("��:");
		String familyName = stdIn.next();
		
		System.out.printf("��:");
		String firstName = stdIn.next();
		
		System.out.println("����ɂ���" + familyName + firstName + "����B");
	}
}
