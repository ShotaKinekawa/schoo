import java.util.Scanner;

class Ex6_17{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		final int numOfPeople = 6;
		final String[] nameOfSubject = { "国語" , "数学",};
		
		int[][] scores = new int[numOfPeople][nameOfSubject.length];
		
		System.out.println( numOfPeople +"人" + nameOfSubject.length 
			+ "科目の点数の科目ごと、学生ごとの平均点をそれぞれ計算します。");
		
		for(String str : nameOfSubject){
			System.out.print(str + "、 ");
		}
		System.out.println("の順に入力してください。");
		
		int[] sumOfSubject = new int[nameOfSubject.length];//科目の合計点
		int[] sumOfPersonalScore = new int[numOfPeople];//各個人の合計点
		
		for(int i = 0; i < numOfPeople; i++){
			for(int j = 0; j < nameOfSubject.length; j++){
				do{
					System.out.print((i + 1) + "人目の" 
						+ nameOfSubject[j] + "の点数:");
					scores[i][j] = stdIn.nextInt();
				}while(scores[i][j] < 0 || scores[i][j] > 100);
				sumOfSubject[j] += scores[i][j];
				sumOfPersonalScore[i] += scores[i][j];
			}
		}
		
		System.out.println("科目ごとの平均点は、");
		for(int i = 0; i < nameOfSubject.length; i++){
			System.out.println(nameOfSubject[i] + ":" 
				+ (double)sumOfSubject[i] / numOfPeople + "点");
		}
		
		System.out.println("学生ごとの平均点は、");
		for(int i = 0; i < numOfPeople; i++){
			System.out.println( (i+1) + "人目:" 
				+ (double)sumOfPersonalScore[i] / nameOfSubject.length +"点");
		}
		
	}
}
