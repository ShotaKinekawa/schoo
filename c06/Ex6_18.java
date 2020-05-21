import java.util.Scanner;

class Ex6_18{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int b; //読み込み用変数
		do{
			System.out.print("行数：");
			b = stdIn.nextInt();
		}while(b < 1);
		
		int[][] c = new int[b][];
		
		for(int i = 0; i< c.length; i++){
			do{
				System.out.print(i + "行目の列数：");
				b = stdIn.nextInt();
			}while(b < 1);
			c[i] = new int[b];
		}
		
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.print("c[" + i + "][" + j +"] = ");
				c[i][j] = stdIn.nextInt();
			}
		}
		
		System.out.println("入力された配列は以下の通りです。");
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
	}
}
