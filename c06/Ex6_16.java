import java.util.Scanner;

class Ex6_16{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		final int aLine = 4;
		final int aCol = 3;
		int[][] a = new int[aLine][aCol];
		int[][] b = new int[aCol][aLine];
		
		System.out.println(aLine +"�s" + aCol +"��̍s��A��" 
			+ aCol +"�s"+ aLine +"��̍s��B�̐�C�����߂܂��B");
		
		for(int i = 0; i < aLine; i++){
			for(int j = 0; j < aCol; j++){
				System.out.print("A["+ i + "][" + j + "] = ");
				a[i][j] = stdIn.nextInt();
			}
		}
		
		for(int i = 0; i < aCol; i++){
			for(int j = 0; j < aLine; j++){
				System.out.print("B["+ i + "][" + j + "] = ");
				b[i][j] = stdIn.nextInt();
			}
		}
		
		System.out.println();
		
		
		for(int i = 0; i < aLine; i++){
			for(int j = 0; j < aLine; j++){
				int sum = 0;
				for(int k = 0; k < aCol; k++){
					sum += a[i][k] * b[k][j];
				}
				System.out.println("C[" + i + "]" + "[" + j + "] = " + sum);
			}
		}
		
	}
}
