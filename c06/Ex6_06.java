import java.util.Scanner;

class Ex6_06{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			System.out.print("�l���F");
			n = stdIn.nextInt();//�v�f���̓ǂݍ���
		}while(n < 0);
		
		int[] score = new int[n];//�_���̔z��̐���
		int max = 0;//�ō��_
		int min = 100; //�Œ�_
		int sum = 0;//���v�_
		
		for(int i = 0; i < n ; i++){
			do{
				System.out.print((i + 1)+"�l�ڂ̓_���F");
				score[i] = stdIn.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			
			sum += score[i];
			min = min > score[i] ? score[i] : min;
			max = max < score[i] ? score[i] : max;
			
		}
		
		System.out.println("���v�_��" + sum + "�_�ł��B");
		System.out.println("���ϓ_��" + (double)sum / n + "�_�ł��B");
		System.out.println("�ō��_��" + max + "�_�ł��B");
		System.out.println("�Œ�_��" + min + "�_�ł��B");
		
	}
}
