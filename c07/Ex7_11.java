import java.util.Scanner;

class Ex7_11{
	
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
	
	static int pow(int a, int r){//a��r��(r > 0)
		int x = 1;
		for(int i = 1; i <= r; i++){
			x *= a;
		}
		return x;
	}
	
	public static void main(String[] args){
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		
		System.out.print("�V�t�g����r�b�g��\n(���V�t�g�͐��A�E�V�t�g�͕�)�F");
		int shift = stdIn.nextInt();
		
		System.out.print("�����l�r�b�g�\�� \t= ");
		printBits(a);
		
		int b;//2�̏�Z�㐮���l
		int c;//�V�t�g�㐮���l
		
		//�V�t�g,2��shift�扉�Z
		if(signOf(shift) == -1){
			c = a >> abs(shift);
			b = a / pow(2, abs(shift));
		}else{
			c = a << shift;
			b = a * pow(2, shift);
		}
		
		System.out.print("�V�t�g��̃r�b�g�\�� \t= ");
		printBits(c);
		
		System.out.println(a +"*2^(" + shift + ") = " + b);
		System.out.print("���̃r�b�g�\��\t \t= ");
		printBits(b);
		
	}
}
