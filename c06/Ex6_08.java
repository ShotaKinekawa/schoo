import java.util.Scanner;

class Ex6_08{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;//要素数
		
		do{
			System.out.print("要素数：");
			n = stdIn.nextInt();
		}while(n < 1);
		
		double[] a = new double[n];
		
		for (int j = 0 ; j < n; j ++){
			System.out.print((j + 1) + "番目の値：");
			a[j] = stdIn.nextDouble();
		}
		
		double sum = 0; //合計
		
		for(double i : a){
			sum += i;
		}
		
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + sum / n);
		
	}
}
