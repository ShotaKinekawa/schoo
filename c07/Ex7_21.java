import java.util.Scanner;

class Ex7_21{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static void aryExchng(int[] a, int[] b){
		int lim = a.length < b.length? a.length : b.length;
		
		int[] tmp = new int[lim];
		
		for(int i = 0; i < lim; i++){
			tmp[i] = a[i];
			a[i] = b[i];
			b[i] = tmp[i];
		}
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
		
		do{
			System.out.print("配列b要素数：");
			num = stdIn.nextInt();
		}while(num < 1);
		
		int[] b = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("b[" + i +"] : " );
			b[i] = stdIn.nextInt();
		}

		
		aryExchng(a, b);
		
		System.out.println("aryExchngで交換しました");
		
		showAry(a, "a");
		showAry(b, "b");
		
	}
	
	
}
