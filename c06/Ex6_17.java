import java.util.Scanner;

class Ex6_17{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		final int numOfPeople = 6;
		final String[] nameOfSubject = { "����" , "���w",};
		
		int[][] scores = new int[numOfPeople][nameOfSubject.length];
		
		System.out.println( numOfPeople +"�l" + nameOfSubject.length 
			+ "�Ȗڂ̓_���̉Ȗڂ��ƁA�w�����Ƃ̕��ϓ_�����ꂼ��v�Z���܂��B");
		
		for(String str : nameOfSubject){
			System.out.print(str + "�A ");
		}
		System.out.println("�̏��ɓ��͂��Ă��������B");
		
		int[] sumOfSubject = new int[nameOfSubject.length];//�Ȗڂ̍��v�_
		int[] sumOfPersonalScore = new int[numOfPeople];//�e�l�̍��v�_
		
		for(int i = 0; i < numOfPeople; i++){
			for(int j = 0; j < nameOfSubject.length; j++){
				do{
					System.out.print((i + 1) + "�l�ڂ�" 
						+ nameOfSubject[j] + "�̓_��:");
					scores[i][j] = stdIn.nextInt();
				}while(scores[i][j] < 0 || scores[i][j] > 100);
				sumOfSubject[j] += scores[i][j];
				sumOfPersonalScore[i] += scores[i][j];
			}
		}
		
		System.out.println("�Ȗڂ��Ƃ̕��ϓ_�́A");
		for(int i = 0; i < nameOfSubject.length; i++){
			System.out.println(nameOfSubject[i] + ":" 
				+ (double)sumOfSubject[i] / numOfPeople + "�_");
		}
		
		System.out.println("�w�����Ƃ̕��ϓ_�́A");
		for(int i = 0; i < numOfPeople; i++){
			System.out.println( (i+1) + "�l��:" 
				+ (double)sumOfPersonalScore[i] / nameOfSubject.length +"�_");
		}
		
	}
}
