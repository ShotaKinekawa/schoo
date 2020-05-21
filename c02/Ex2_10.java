import java.util.Scanner;

class Ex2_10{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.printf("ê©:");
		String familyName = stdIn.next();
		
		System.out.printf("ñº:");
		String firstName = stdIn.next();
		
		System.out.println("Ç±ÇÒÇ…ÇøÇÕ" + familyName + firstName + "Ç≥ÇÒÅB");
	}
}
