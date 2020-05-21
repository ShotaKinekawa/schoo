import java.util.Scanner;

class Ex7_14{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void printBits(int x){
		for(int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
		System.out.println();
	}
	
	static int signOf(int n){
		if(n < 0){
			return -1;
		}else if(n > 0){
			return 1;
		}
		return 0;
	}
	
	static int abs(int x){
		return x * signOf(x);
	}
	
	static int setN(int x, int pos, int n){
		int s = 1;
		for(int i = 1; i < n; i++){
			s <<= 1;
			s += 1;
		}
		s <<= pos;
		return (x | s);
	}
	
	static int resetN(int x, int pos, int n){
		int s = 1;
		for(int i = 0; i < 31; i++){
			s <<= 1;	
			s += 1;
		}//
		
		for(int i = 0; i < n; i++){
			s -= pow(2, pos + i);
		}
		return (x & s);
	}	
	
	static int inverseN(int x, int pos, int n){
		int s = 1;
		for(int i = 1; i < n; i++){
			s <<= 1;
			s += 1;
		}
		s <<= pos;
		return (x ^ s);
	}	
	
	static int pow(int a, int r){	//aのr乗(r > 0)
		int x = 1;
		for(int i = 1; i <= r; i++){
			x *= a;
		}
		return x;
	}
	
	public static void main(String[] args){
		
		System.out.print("整数x：");
		int x = stdIn.nextInt();
		
		System.out.print("pos：");
		int pos = stdIn.nextInt();
		
		System.out.print("n：");
		int n = stdIn.nextInt();
		
		System.out.print("整数値ビット構成 \t= ");
		printBits(x);
		
		int c = 0; // 変換後の整数
		
		//シフト
		System.out.print("setNビット構成 \t\t= ");
		printBits(setN(x , pos, n));
		
		System.out.print("resetNビット構成 \t= ");
		printBits(resetN(x , pos, n));
		
		System.out.print("inverseNビット構成 \t= ");
		printBits(inverseN(x , pos, n));
		
	}
}
