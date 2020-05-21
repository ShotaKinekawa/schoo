import java.util.Scanner;
import java.util.Random;

class Ex06_11_r01{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int idxN = stdIn.nextInt();
		
		int[] a = new int[idxN];
		
		Random rand = new Random();
		a[0] = rand.nextInt(idxN) + 1;
		
		System.out.println(0 + "："+ a[0]);
		
		for(int i = 1; i < idxN; i++){
			boolean flg;
			do{
				flg = false;
				a[i] = rand.nextInt(idxN) + 1;
				
				for(int j = 0; j < i; j++){
					if(a[i] == a[j]){
						flg = true;
						break;
					}
				}
			}while(flg);
			
			System.out.println(i + "："+ a[i]);
		}
	}
	
}