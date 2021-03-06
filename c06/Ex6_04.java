import java.util.Scanner;
import java.util.Random;

class Ex6_04{
	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n = stdIn.nextInt();//要素数の読み込み
		
		int[] a = new int[n];//配列の生成
		int max = 0;//最大値を格納
		
		for(int i = 0; i < n; i++){
			a[i] = 1 + rand.nextInt(10);
			if(a[i] > max){
				max = a[i];
			}
		}
		
		for(int i = max; i > 0; i--){
			for(int j = 0; j < n; j++){
				if(a[j] == i){
					System.out.print("* ");
					a[j]--;
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < n; i++)
			System.out.print("--");
		
		System.out.println();
		
		for(int i = 0; i < n; i++)
			System.out.print( i%10  + " ");
		
		System.out.println();
	}
}
