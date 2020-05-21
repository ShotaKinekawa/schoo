import java.util.Scanner;

class Ex7_20{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void aryIns(int[] a, int idx, int x){
		for(int i = a.length - 1; i > idx; i--){
			a[i] = a[i - 1];
		}
		a[idx] = x;
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
		
		System.out.print("挿入するインデックス:");
		int idx = stdIn.nextInt();
		
		System.out.print("新たなx["+ idx +"] = ");
		int n = stdIn.nextInt();
		
		aryIns(x, idx, n);
		
		for(int i = 0; i < num; i++){
			System.out.println("x[" + i +"] : " + x[i]);
		}
	}
	
	
}
