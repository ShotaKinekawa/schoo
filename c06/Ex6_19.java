import java.util.Scanner;

class Ex6_19{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		
		//入力
		
		int b; //読み込み用変数
		do{
			System.out.print("クラス数：");
			b = stdIn.nextInt();
		}while(b < 1);
		
		System.out.println();
		int[][] c = new int[b][];
		
		for(int i = 0; i< c.length; i++){
			do{
				System.out.print((i + 1) + "組の人数：");
				b = stdIn.nextInt();
			}while(b < 1);
			c[i] = new int[b];
			
			for(int j = 0; j < c[i].length; j++){
				do{
					System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
					b = stdIn.nextInt();
				}while(b < 0 || b > 100);
				
				c[i][j] = b;
			}
			
			System.out.println();
		}
		
		
		//点数計算
		int[] sumClass = new int[c.length];//クラスごとの合計点
		int sumAll = 0;						//全員の合計点
		int numAll = 0;						//全員の人数
		
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				sumClass[i] += c[i][j];
				sumAll += c[i][j];
				numAll++;
			}
		}
		
		System.out.println("  組 |\t合計\t平均");
		System.out.println("-----+------------------------");
		for(int i = 0; i < sumClass.length; i++){
			System.out.printf("%2d組 |\t%4d\t%4.1f\n",(i + 1), sumClass[i], (double)sumClass[i]/c[i].length);
		}
		System.out.println("-----+------------------------");
		System.out.printf ("  計 |\t%4d\t%4.1f\n", sumAll, (double)sumAll/numAll);
	}
}
