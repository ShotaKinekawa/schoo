import java.util.Scanner;

class Ex7_27{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static boolean addMatrix(int[][] x, int[][]y, int[][] z){
		if(!isSameNumOfIdx(x, y)){
			return false;
		}
		if(!isSameNumOfIdx(y, z)){
			return false;
		}
		if(!isSameNumOfIdx(z, x)){
			return false;
		}
		
		for(int  i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		return true;
	}
	
	static boolean isSameNumOfIdx(int[][] x, int[][]y){
		if(x.length != y.length){
			return false;
		}
		
		for(int i = 0; i < x.length; i++){
			if(x[i].length != y[i].length){
				return false;
			}
		}
		
		return true;
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
						{5, 1, 2,},
					};
		int[][] c = new int[2][3];
		
		boolean res = addMatrix(a, b, c);
		System.out.println("加算結果：" + res);
		
		if(res){
			printMatrix(a, "a");
			printMatrix(b, "b");
			printMatrix(c, "c");
		}
	}
	
}
