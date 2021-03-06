import java.util.Scanner;
import java.util.Random;

class Ex6_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;//要素数(手入力)
		final int lim = 10; //要素数上限
		
		do{
			System.out.print("要素数：");
			n = stdIn.nextInt();
		}while(n < 1 || n > lim);
		
		int[] a = new int[lim];
		
		for(int i = 0; i < lim; i++){//メモの用意
			a[i] = i + 1;
		}
		
		for(int i = 0; i < lim; i++){
			int r = rand.nextInt(lim - i);
			int tmp = a[r];
			a[r] = a[lim - 1 - i];
			a[lim - 1 - i] = tmp;
		}
		
		for(int i = 0; i < n; i++){
			System.out.println("a[" + i +"]= " + a[i]);
		}
	
	}
}
