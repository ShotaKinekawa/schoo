import java.util.Scanner;

class Ex7_28{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//�z��{��, �z��
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static int[][] addMatrix(int[][] x, int[][]y){
		
		int[][] z = new int[x.length][];
		
		for(int  i = 0; i < x.length; i++){
			z[i] = new int[x[i].length];
			for(int j = 0; j < x[i].length; j++){
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		return z;
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
		
	static void printMatrix(int[][] m, String name){//�s��{��, �s��
		System.out.println("�s��" + name);
		
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
		
		int [][] res = addMatrix(a, b);
		System.out.println("���Z����");
		
		printMatrix(res, "res");
	}
	
}
