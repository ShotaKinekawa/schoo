import java.util.Scanner;

class Ex2_10{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.printf("姓:");
		String familyName = stdIn.next();
		
		System.out.printf("名:");
		String firstName = stdIn.next();
		
		System.out.println("こんにちは" + familyName + firstName + "さん。");
	}
}
