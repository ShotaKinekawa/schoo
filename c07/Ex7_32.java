import java.util.Scanner;

class Ex7_32{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void printBits(int x){
		for(int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
		System.out.println();
	}
	
	static void printBits(byte x){
		for(int i = 7; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
		System.out.println();
	}
	
	static void printBits(short x){
		for(int i = 15; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
		System.out.println();
	}
	
	
	static void printBits(long x){
		for(int i = 63; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		System.out.print("byte：");
		byte a = stdIn.nextByte();
		printBits(a);
		
		System.out.print("short：");
		short b = stdIn.nextShort();
		printBits(b);
		
		System.out.print("int：");
		int c = stdIn.nextInt();
		printBits(c);
		
		System.out.print("long：");
		long d = stdIn.nextLong();
		printBits(d);

	}
	
}
