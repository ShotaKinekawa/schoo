import java.util.Scanner;

class Ex7_13{
	
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
	
	static int set(int x, int pos){
		int s = 1;
		s <<= pos;
		return (x | s);
	}
	
	static int reset(int x, int pos){
		int s = 1;
		for(int i = 0; i < 31; i++){
			s <<= 1;	
			s += 1;
		}
		s -= pow(2, pos);
		return (x & s);
	}	
	
	static int inverse(int x, int pos){
		int s = 1;
		s <<= pos;
		return (x ^ s);
	}	
	
	static int pow(int a, int r){	//a��r��(r > 0)
		int x = 1;
		for(int i = 1; i <= r; i++){
			x *= a;
		}
		return x;
	}
	
	public static void main(String[] args){
		
		System.out.print("����x�F");
		int x = stdIn.nextInt();
		
		System.out.print("pos�F");
		int pos = stdIn.nextInt();
		
		System.out.print("�����l�r�b�g�\�� \t= ");
		printBits(x);
		
		int c = 0; // �ϊ���̐���
		
		//�V�t�g
		System.out.print("set�r�b�g�\�� \t\t= ");
		printBits(set(x , pos));
		
		System.out.print("reset�r�b�g�\�� \t= ");
		printBits(reset(x , pos));
		
		System.out.print("inverse�r�b�g�\�� \t= ");
		printBits(inverse(x , pos));
		
	}
}
