import java.util.Scanner;
import java.util.Random;

class Ex7_10{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry(){
		int cont;
		do{
			System.out.print("もう一度？<Yes...1/No...0>:");
			cont = stdIn.nextInt();
		}while(cont != 0 && cont != 1);
		
		return cont == 1;
	}
	
	static boolean isCorrect(int x, int y, int z, int q){
		int ans; //正解
		String question; //問題文
		
		switch(q){
			case 0:
				ans = x + y + z;
				question = x + " + " + y + " + " + z;
				break;
			case 1:
				ans = x + y - z;
				question = x + " + " + y + " - " + z;
				break;
			case 2:
				ans = x - y + z;
				question = x + " - " + y + " + " + z;
				break;
			case 3:
				ans = x - y - z;
				question = x + " - " + y + " - " + z;
				break;
				
			default:
				System.out.println("エラー");
				return true;
		}
		
		System.out.print(question + " = ");
		return ans == stdIn.nextInt();
	}
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		System.out.println("暗算能力トレーニング!!");
		
		do{
			int x = rand.nextInt(900) + 100; //x~z:3桁の数
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			int quiz = rand.nextInt(4);//問題の種類
			
			while(true){
				if(isCorrect(x, y, z, quiz)){
					break;
				}
				System.out.println("違いますよ!!");
			}
		}while(confirmRetry());
		
	}
}
