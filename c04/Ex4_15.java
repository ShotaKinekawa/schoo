import java.util.Scanner;

class Ex4_15{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		int from;
		do {
			System.out.print("��cm����F");
			from = stdIn.nextInt();
		}while(from <= 0);
		
		
		int to;
		do{
			System.out.print("��cm�܂ŁF");
			to = stdIn.nextInt();
		}while(from >= to );
		
		
		int dist;
		do{
			System.out.print("��cm���ƁF");
			dist = stdIn.nextInt();
		}while (dist <= 0);
		
		System.out.printf("�g��\t�W���̏d\n");
		
		for(int i = from; i <= to; i += dist){
			System.out.printf("%d\t%2.2f\n",i, ((double)i-100.0)*0.9);
		}
		
	}
}
