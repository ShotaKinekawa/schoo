import java.util.Scanner;

class Ex7_33{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void printArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	static void printArray(int[][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.printf(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		int[][] a = {	{1, 2, 3},
						{4, 5, 6},
					};
		int[][] b = {	{-6,},
						{5, 1, 2,},
						{-2, 0, 9},
					};
		
		int[] c = {-7, 8, 9};
		
		System.out.println("”z—ña");
		printArray(a);
		System.out.println("”z—ñb");
		printArray(b);
		System.out.println("”z—ñc");
		printArray(c);
		System.out.println();
	}
	
}
