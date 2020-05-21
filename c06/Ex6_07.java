import java.util.Random;
import java.util.Scanner;

class Ex6_07{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for (int j = 0 ; j < n; j ++){
			a[j] = rand.nextInt(10);
		}
		
		System.out.print("配列aの全要素の値\n{");
		for(int j = 0; j < n; j++){
			System.out.print(a[j] + " ");
		}
		System.out.println("}");
		
		System.out.print("探す数値：");
		int key = stdIn.nextInt();
		
		int i;
		for(i = n -1; i >= 0 ; i--){
			if(a[i] == key){
				break;
			}
		}
		
		if (i >= 0){
			System.out.println("それは、a[" + i + "]にあります。");
		}else{
			System.out.println("それはありません。");
		}
	}
}
