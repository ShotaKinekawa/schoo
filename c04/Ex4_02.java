import java.util.Random;
import java.util.Scanner;

class Ex4_02{
	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int number = rand.nextInt(90);//0~89の乱数値
		number += 10; //10~99の乱数値(正解の値)
		
		int ans;//解答用
		
		System.out.print
		("数当てゲーム開始！！\n10～99の数を当ててください！\n");
		
		do{
			System.out.print("いくつかな？:");
			 ans = stdIn.nextInt();
			
			if (ans > number){
				System.out.println("もっと小さな値だよ！");
			}else if(ans < number){
				System.out.println("もっと大きな値だよ！");
			}
			
		}while(ans != number);
		
		System.out.println("正解です！お疲れ様でした。");

	}
}
