import java.util.Scanner;

class Ex6_08{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;//�v�f��
		
		do{
			System.out.print("�v�f���F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		double[] a = new double[n];
		
		for (int j = 0 ; j < n; j ++){
			System.out.print((j + 1) + "�Ԗڂ̒l�F");
			a[j] = stdIn.nextDouble();
		}
		
		double sum = 0; //���v
		
		for(double i : a){
			sum += i;
		}
		
		System.out.println("���v�l�F" + sum);
		System.out.println("���ϒl�F" + sum / n);
		
	}
}
