import java.util.Scanner;

class Ex7_26{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//配列本体, 配列名
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}

	static int[] aryInsOf(int[] a, int idx, int x){
		int[] r = new int[a.length + 1];
		
		for(int i = 0; i < r.length; i++){
			if(i < idx){
				r[i] = a[i];
			}else if (i == idx){
				r[i] = x;
			}else{
				r[i] = a[i - 1];
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
		
		System.out.print("挿入インデックス：");
		int idx = stdIn.nextInt();
		
		System.out.print("新しいa["+ idx + "] : ");
		int ins = stdIn.nextInt();
		
		
		showAry(aryInsOf(a, idx, ins), "aryInsOf(a, " + idx +", " + ins +")");
		
	}
	
	
}
