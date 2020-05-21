import java.util.Scanner;

class Ex6_05{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int n = stdIn.nextInt();//要素数の読み込み
		
		int[] a = new int[n];//配列の生成
		
		for(int i = 0; i < n ; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
		
		for(int i = 0; i < n; i++){
			System.out.print(a[i]);
			if(i == n -1){
				System.out.print("}");
			}else{
				System.out.print(", ");
			}
		}
	}
}
