import java.util.Scanner;

class Ex7_17{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int linearSearchR(int[] a, int key){
		for(int i = a.length - 1; i >= 0; i--){
			if(a[i] == key){
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		
		int num;
		do{
			System.out.print("�v�f���F");
			num = stdIn.nextInt();
		}while(num < 1);
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x[" + i +"] : " );
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�T���l:");
		int ky = stdIn.nextInt();
		
		int idx = linearSearchR(x, ky);
		
		if(idx == -1){
			System.out.println("���̒l�̗v�f�͑��݂��܂���B");
		}else{
			System.out.println("���̒l��x[" + idx + "]�ɂ���܂��B");
		}
		
	}
	
	
}
