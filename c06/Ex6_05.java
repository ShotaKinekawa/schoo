import java.util.Scanner;

class Ex6_05{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();//�v�f���̓ǂݍ���
		
		int[] a = new int[n];//�z��̐���
		
		for(int i = 0; i < n ; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
		
		for(int i = 0; i < n; i++){
			System.out.print(a[i]);
			if(i == n -1){
				System.out.print("}");
			}else{
				System.out.print(", ");
			}
		}
	}
}
