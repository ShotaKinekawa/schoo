import java.util.Scanner;

class Ex7_29{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static int absolute(int x){
		if(x >= 0){
			return x;
		}
		
		return -x;
	}
	
	static int[][] aryClone2(int[][] a){
		int[][] tmp = new int[a.length][];
		
		for(int i= 0; i < a.length; i++){
			tmp[i] = new int[a[i].length];
			
			for(int j = 0; j < a[i].length; j++){
				tmp[i][j] = a[i][j];
			}
		}
		
		return tmp;
	}
	
	static void printMatrix(int[][] m, String name){//行列本体, 行列名
		System.out.println("行列" + name);
		
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
		
	public static void main(String[] args){
		int[][] a = {	{1, 2, 3},
						{4, 5, 6},
					};
		int[][] b = {	{6, 3, 4,},
						{5, 2,},
					};
		
		int [][] res = aryClone2(a);
		System.out.println("結果1");
		
		printMatrix(res, "res");
		
		int [][] res2 = aryClone2(b);
		System.out.println("結果2");
		
		printMatrix(res2, "res2");

	}
	
}
