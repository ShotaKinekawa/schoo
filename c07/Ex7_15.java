import java.util.Scanner;

class Ex7_15{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int sumOf(int[] a){
		int sum = 0;
		for(int n : a){
			sum += n;
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		
		System.out.print("�v�f���F");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i +"] : " );
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�z��x�̍��v��"+ sumOf(x) + "�ł��B");
		
		
	}
	
	
}
