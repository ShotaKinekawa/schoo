import java.util.Scanner;

class Ex7_01{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("signOfの返り値を表示します。\n整数：");
		int d  = stdIn.nextInt();
		System.out.print("返り値："+ signOf(d));
	}
	
	static int signOf(int n){
		if(n < 0){
			return -1;
		}else if(n > 0){
			return 1;
		}
		
		return 0;
	}
}
