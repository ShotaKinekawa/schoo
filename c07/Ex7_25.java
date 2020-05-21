import java.util.Scanner;

class Ex7_25{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//�z��{��, �z��
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	public static int[] aryRmvOfN(int[] a, int idx, int n){
		int[] r = new int [a.length - n];
		
		for(int i = 0; i < r.length; i++){
			if(i < idx){
				r[i] = a[i];
			}else{
				r[i] = a[i + n];
			}
		}
		return r;
	}
	
	public static void main(String[] args){
		
		int num;
		do{
			System.out.print("�z��a�v�f���F");
			num = stdIn.nextInt();
		}while(num < 1);
		
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("a[" + i +"] : " );
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("�폜�C���f�b�N�X�F");
		int idx = stdIn.nextInt();
		
		int del;
		do{
			System.out.print("�폜�v�f���F");
			del = stdIn.nextInt();
		}while(del < 1);
		
		
		showAry(aryRmvOfN(a, idx, del), "aryRmvOfN(a, " + idx +", " + del +")");
		
	}
	
	
}
