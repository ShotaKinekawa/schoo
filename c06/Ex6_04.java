import java.util.Scanner;
import java.util.Random;

class Ex6_04{
	public static void main(String[] args){
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int n = stdIn.nextInt();//—v‘f”‚Ì“Ç‚İ‚İ
		
		int[] a = new int[n];//”z—ñ‚Ì¶¬
		int max = 0;//Å‘å’l‚ğŠi”[
		
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
