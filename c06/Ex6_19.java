import java.util.Scanner;

class Ex6_19{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		
		//����
		
		int b; //�ǂݍ��ݗp�ϐ�
		do{
			System.out.print("�N���X���F");
			b = stdIn.nextInt();
		}while(b < 1);
		
		System.out.println();
		int[][] c = new int[b][];
		
		for(int i = 0; i< c.length; i++){
			do{
				System.out.print((i + 1) + "�g�̐l���F");
				b = stdIn.nextInt();
			}while(b < 1);
			c[i] = new int[b];
			
			for(int j = 0; j < c[i].length; j++){
				do{
					System.out.print((i + 1) + "�g" + (j + 1) + "�Ԃ̓_���F");
					b = stdIn.nextInt();
				}while(b < 0 || b > 100);
				
				c[i][j] = b;
			}
			
			System.out.println();
		}
		
		
		//�_���v�Z
		int[] sumClass = new int[c.length];//�N���X���Ƃ̍��v�_
		int sumAll = 0;						//�S���̍��v�_
		int numAll = 0;						//�S���̐l��
		
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j < c[i].length; j++){
				sumClass[i] += c[i][j];
				sumAll += c[i][j];
				numAll++;
			}
		}
		
		System.out.println("  �g |\t���v\t����");
		System.out.println("-----+------------------------");
		for(int i = 0; i < sumClass.length; i++){
			System.out.printf("%2d�g |\t%4d\t%4.1f\n",(i + 1), sumClass[i], (double)sumClass[i]/c[i].length);
		}
		System.out.println("-----+------------------------");
		System.out.printf ("  �v |\t%4d\t%4.1f\n", sumAll, (double)sumAll/numAll);
	}
}
