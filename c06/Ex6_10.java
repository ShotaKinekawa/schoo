import java.util.Scanner;
import java.util.Random;

class Ex6_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;//—v‘f”
		
		do{
			System.out.print("—v‘f”F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		int[] a = new int[n];
		
		a[0] = rand.nextInt(10) + 1; // 0~9‚Ì—”+1 -> 1~10‚Ì—”
		System.out.println("a[0]= " + a[0]);
		
		for(int i = 1; i < n; i++){
			do{
				a[i] = rand.nextInt(10) + 1;
			} while(a[i-1] == a[i]);
			
			System.out.println("a[" + i +"]= " + a[i]);
		}
		
	
	}
}
