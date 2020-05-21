import java.util.Scanner;

class Ex7_18{
	
	static Scanner stdIn = new Scanner(System.in);
	
	public static void aryRmv(int[] a, int idx){
		for(int i = idx; i < a.length - 1; i++){
			a[i] = a[i + 1];
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
		
		System.out.print("削除するインデックスidx:");
		int idx = stdIn.nextInt();
		
		aryRmv(x, idx);
		
		for(int i = 0; i < num; i++){
			System.out.println("x[" + i +"] : " + x[i]);
		}
	}
	
	
}
