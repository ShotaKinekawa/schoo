import java.util.Random;
import java.util.Scanner;

class Ex2_8{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.printf("整数値:");
		int x = stdIn.nextInt();
		
		Random rand = new Random();
		int r = rand.nextInt(11);//0~10の整数乱数
		r = r - 5; //範囲-5~+5
		
		System.out.println("その値の±5の乱数を生成しました。それは"
			+ (x+r) );
	}
}
