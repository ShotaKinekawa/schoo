import java.util.Scanner;

class Ex7_16{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int minOf(int[] a){
		int min = a[0];
		for(int n : a){
			if(min > n){
				min = n;
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		
		System.out.print("�v�f���F");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i +"] : " );
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�z��x�̍ŏ��l��"+ minOf(x) + "�ł��B");
		
		
	}
	
	
}
