import java.util.Scanner;

class Ex7_23{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static int[] arraySrchIdx(int[] a, int x){
		int cnt = 0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == x){
				cnt++;
			}
		}
		
		int[] r = new int[cnt];
		int idx = 0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == x){
				r[idx] = i;
				idx++;
			}
		}
		
		return r;
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
		
		System.out.print("検索値：");
		int find = stdIn.nextInt();
		
		
		System.out.println(find + "を検索します。");
		
		showAry(arraySrchIdx(a,  find), "arraySrchIdx");
		
	}
	
	
}
