import java.util.Scanner;

class Ex3_16{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		
		System.out.print("整数B:");
		int b = stdIn.nextInt();
		
		System.out.print("整数C:");
		int c = stdIn.nextInt();
		
		int tmp;
		
		if(a > b){
			tmp = b;
			b = a;
			a = tmp;
		}
		if ( b > c ){
			tmp = c;
			c = b;
			b = tmp;
		} //ここでcが最大値になる。
		
		if(a > b){
			tmp = b;
			b = a;
			a = tmp;
		}
		System.out.println("昇順:"+ a + "," + b + "," + c);
	}
}
