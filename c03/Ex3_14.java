import java.util.Scanner;

class Ex3_14{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		
		System.out.print("整数B:");
		int b = stdIn.nextInt();
		
		
		int min, max;
		
		if(a < b){
			min = a;
			max = b;
		}else{
			min = b;
			max = a;
		}
		
		if(min == max){
			System.out.println("2つの値は同じです。");
		}else{
			System.out.println("小さい方の値は" + min + "です。");
			System.out.println("大きい方の値は" + max + "です。");
		}
	}
}
