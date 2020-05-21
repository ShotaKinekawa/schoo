import java.util.Scanner;

class Ex6_13{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n;//要素数(手入力)
		
		do{
			System.out.print("要素数：");//要素数読み込み
			n = stdIn.nextInt();
		}while(n < 1);
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		
		for (int i = 0 ; i < n; i++){
			System.out.print("a[" + i + "] = " );//配列aの値読み込み
			a[i] = stdIn.nextInt();
			b[n - 1 - i] = a[i]; //配列bに逆順コピー
		}
		
		System.out.println("aの全要素をbにコピーしました。");
		for(int i = 0; i < n; i++){
			System.out.println("b[" + i + "] = " + b[i] );//b[i]表示
		}
	
	}
}
