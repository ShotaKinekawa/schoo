import java.util.Scanner;

class Ex7_12{
	
	static Scanner stdIn = new Scanner(System.in);
	
	static void printBits(int x){
		for(int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
		System.out.println();
	}
	
	static int signOf(int n){
		if(n < 0){
			return -1;
		}else if(n > 0){
			return 1;
		}
		return 0;
	}
	
	static int abs(int x){
		return x * signOf(x);
	}
	
	static int rRotate(int x, int n){
		int tmp = 1;
		for(int i = 0; i < n; i++){
			tmp <<= 1;
			tmp += 1;
		}
		
		tmp &= x;
		x >>>= n;
		tmp <<= (32 - n);
		return (x | tmp);
	}
	
	static int lRotate(int x, int n){
		int tmp = 1;
		for(int i = 0; i < n; i++){
			tmp <<= 1;
			tmp += 1;
		}
		tmp <<= 32 - n;
		tmp &= x;
		tmp >>>= 32 - n;
		x <<= n;
		return (x | tmp);
	}
	
	public static void main(String[] args){
		
		System.out.print("����x�F");
		int x = stdIn.nextInt();
		
		System.out.print("�V�t�g����r�b�g��\n(����]�͐��A�E��]�͕�)�F");
		int shift = stdIn.nextInt();
		
		System.out.print("�����l�r�b�g�\�� \t= ");
		printBits(x);
		
		int c = 0; // �V�t�g��̐���
		
		//�V�t�g
		if(signOf(shift) == -1){
			c = rRotate(x, abs(shift));
		}else{
			c = lRotate(x ,abs(shift));
		}
		
		System.out.print("�V�t�g��̃r�b�g�\�� \t= ");
		printBits(c);
		
	}
}
