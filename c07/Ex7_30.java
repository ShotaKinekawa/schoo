import java.util.Scanner;

class Ex7_30{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void showAry(int[] a, String str){//�z��{��, �z��
		for(int i = 0; i < a.length; i++){
			System.out.println(str +"[" + i +"] : " + a[i]);
		}
		System.out.println();
	}
	
	static int min(int a, int b){
		return a > b ? b : a;
	}
	
	static int min(int a, int b, int c){
		int m = min(a, b);
		return min(m , c);
	}
	
	static int min(int[] a){
		int m = a[0];
		
		for(int i = 1; i < a.length; i++){
			m = min(m, a[i]);
		}
		
		return m;
	}
	
	public static void main(String[] args){
		
		int a = 3;
		int b = 8;
		int c = -4;
		int[] d = {0, 2, 5, -2, 7, 1, -7};
		
		System.out.println(a + "," + b + "�̍ŏ��l��" + min(a, b));
		
		System.out.println(a + "," + b + "," + c + "�̍ŏ��l��" + min(a, b, c));
		
		showAry(d, "d");
		System.out.println("���̔z��̍ŏ��l��" + min(d));
	}
	
}
