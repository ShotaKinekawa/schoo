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
		
		System.out.print("int：");
		int a = stdIn.nextInt();
		System.out.println("この絶対値は" + absolute(a) + "です。");
		
		System.out.print("long：");
		long b = stdIn.nextLong();
		System.out.println("この絶対値は" + absolute(b) + "です。");
		
		System.out.print("float：");
		float c = stdIn.nextFloat();
		System.out.println("この絶対値は" + absolute(c) + "です。");
		
		System.out.print("double：");
		double d = stdIn.nextDouble();
		System.out.println("この絶対値は" + absolute(d) + "です。");
	}
	
}
