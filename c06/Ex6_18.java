import java.util.Scanner;

class Ex6_18{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int b; //�ǂݍ��ݗp�ϐ�
		do{
			System.out.print("�s���F");
			b = stdIn.nextInt();
		}while(b < 1);
		
		int[][] c = new int[b][];
		
		for(int i = 0; i< c.length; i++){
			do{
				System.out.print(i + "�s�ڂ̗񐔁F");
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
		
		System.out.println("���͂��ꂽ�z��͈ȉ��̒ʂ�ł��B");
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
	}
}
