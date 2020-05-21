import java.util.Random;
import java.util.Scanner;

class Ex4_27{
	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int number = rand.nextInt(100);//当てるべき数：0~99の乱数値
		int ans;//解答用
		int times = 5;//解答回数
		
		System.out.print
		("数当てゲーム開始！！\n0～99の数を当ててください！\n");
		
		do{
			System.out.print("いくつかな？(解答権残り"+ times +"回):");
			ans = stdIn.nextInt();
			times--;
			if(times == 0){
				System.out.println("残念！正解は"+ number +"でした。");
				break;
			}
			
			if (ans > number){
				System.out.println("もっと小さな値だよ！");
			}else if(ans < number){
				System.out.println("もっと大きな値だよ！");
			}else{
				System.out.println("正解です！お疲れ様でした。");
				break;
			}
			
		}while(ans != number);
		

	}
}
