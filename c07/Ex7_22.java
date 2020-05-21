import java.util.Scanner;

class Ex7_22{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static int[] arrayClone(int[] a){
		int[] copy = new int[a.length];
		
		for(int i = 0; i < a.length; i++){
			copy[i] = a[i];
		}
		
		return copy;
	}
	
	public static void main(String[] args){
		
		int num;
		do{
			System.out.print("配列a要素数：");
			num = stdIn.nextInt();
		}while(num < 1);
		
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("a[" + i +"] : " );
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("arrayCloneで配列をコピーします。");
		
		showAry((arrayClone(a)), "copy_a");
		
	}
	
	
}
