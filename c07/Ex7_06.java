import java.util.Scanner;

class Ex7_06{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ƒƒ\ƒbƒhprintSeason");
		
		System.out.print("m:");
		int m  = stdIn.nextInt();
		
		printSeason(m);
		
	}
	
	static void printSeason(int m){
		switch(m){
			case 3: case 4: case 5:
				System.out.println("t");
				break;
			
			case 6: case 7: case 8:
				System.out.println("‰Ä");
				break;
			
			case 9: case 10: case 11:
				System.out.println("H");
				break;
			
			case 12: case 1: case 2:
				System.out.println("“~");
				break;
			
			default: break;
		}
	}
}
