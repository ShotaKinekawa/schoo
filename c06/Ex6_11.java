import java.util.Scanner;
import java.util.Random;

class Ex6_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;//—v‘f”(è“ü—Í)
		final int lim = 10; //—v‘f”ãŒÀ
		
		do{
			System.out.print("—v‘f”F");
			n = stdIn.nextInt();
		}while(n < 1 || n > lim);
		
		int[] a = new int[lim];
		
		for(int i = 0; i < lim; i++){//ƒƒ‚‚Ì—pˆÓ
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
