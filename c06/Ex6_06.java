import java.util.Scanner;

class Ex6_06{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("人数：");
			n = stdIn.nextInt();//要素数の読み込み
		}while(n < 0);
		
		int[] score = new int[n];//点数の配列の生成
		int max = 0;//最高点
		int min = 100; //最低点
		int sum = 0;//合計点
		
		for(int i = 0; i < n ; i++){
			do{
				System.out.print((i + 1)+"人目の点数：");
				score[i] = stdIn.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			
			sum += score[i];
			min = min > score[i] ? score[i] : min;
			max = max < score[i] ? score[i] : max;
			
		}
		
		System.out.println("合計点は" + sum + "点です。");
		System.out.println("平均点は" + (double)sum / n + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
		
	}
}
