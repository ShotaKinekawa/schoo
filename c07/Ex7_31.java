import java.util.Scanner;

class Ex7_31{
	
	static Scanner stdIn = new Scanner(System.in);
		
	static int absolute(int x){
		if(x >= 0){
			return x;
		}
		
		return -x ;
	}
	
	static long absolute(long x){
		if(x >= 0){
			return x;
		}
		
		return -x ;
	}
	
	static float absolute(float x){
		if(x >= 0){
			return x;
		}
		
		return -x ;
	}
	
	static double absolute(double x){
		if(x >= 0){
			return x;
		}
		
		return -x ;
	}
	
	public static void main(String[] args){
		
		System.out.print("int�F");
		int a = stdIn.nextInt();
		System.out.println("���̐�Βl��" + absolute(a) + "�ł��B");
		
		System.out.print("long�F");
		long b = stdIn.nextLong();
		System.out.println("���̐�Βl��" + absolute(b) + "�ł��B");
		
		System.out.print("float�F");
		float c = stdIn.nextFloat();
		System.out.println("���̐�Βl��" + absolute(c) + "�ł��B");
		
		System.out.print("double�F");
		double d = stdIn.nextDouble();
		System.out.println("���̐�Βl��" + absolute(d) + "�ł��B");
	}
	
}
