import java.util.Scanner;

class Ex7_11{
	
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
	
	static int pow(int a, int r){//aのr乗(r > 0)
		int x = 1;
		for(int i = 1; i <= r; i++){
			x *= a;
		}
		return x;
	}
	
	public static void main(String[] args){
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		
		System.out.print("シフトするビット数\n(左シフトは正、右シフトは負)：");
		int shift = stdIn.nextInt();
		
		System.out.print("整数値ビット構成 \t= ");
		printBits(a);
		
		int b;//2の乗算後整数値
		int c;//シフト後整数値
		
		//シフト,2のshift乗演算
		if(signOf(shift) == -1){
			c = a >> abs(shift);
			b = a / pow(2, abs(shift));
		}else{
			c = a << shift;
			b = a * pow(2, shift);
		}
		
		System.out.print("シフト後のビット構成 \t= ");
		printBits(c);
		
		System.out.println(a +"*2^(" + shift + ") = " + b);
		System.out.print("そのビット構成\t \t= ");
		printBits(b);
		
	}
}
