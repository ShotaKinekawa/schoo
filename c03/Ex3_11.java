import java.util.Scanner;

class Ex3_11{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		
		System.out.print("整数B:");
		int b = stdIn.nextInt();
		
		System.out.println("それらの差は" + 
			(( a - b <= 10 && a - b >= -10)? "10以下です。" : "11以上です。"));
		
	}
}
