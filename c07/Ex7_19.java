import java.util.Scanner;

class Ex7_19{
	
	static Scanner stdIn = new Scanner(System.in);
	
	public static void aryRmvN(int[] a, int idx, int n){
		for(int i = 0; i < n; i++){
			if(idx + n + i == a.length){
				break;
			}
			a[idx + i] = a[idx + n + i];
		}
	}
	
	
	public static void main(String[] args){
		
		int num;
		do{
			System.out.print("要素数：");
			num = stdIn.nextInt();
		}while(num < 1);
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i +"] : " );
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("削除するインデックス:");
		int idx = stdIn.nextInt();
		
		System.out.print("削除する数:");
		int n = stdIn.nextInt();
		
		aryRmvN(x, idx, n);
		
		for(int i = 0; i < num; i++){
			System.out.println("x[" + i +"] : " + x[i]);
		}
	}
	
	
}
