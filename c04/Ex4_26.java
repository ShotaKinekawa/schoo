import java.util.Scanner;

class Ex4_26{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("整数を加算します。\n何個加算しますか：");
			n = stdIn.nextInt();
		}while(n < 1);
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < n; i++){
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if(t < 0){
				System.out.println("負の数は加算しません");
				continue;
			}
			
			sum += t;
			count++;
		}
		
		System.out.println("合計は" + sum + "です。");
		if(count > 0){
			System.out.println("平均は" + (double) sum / count + "です。");
		}else{
			System.out.println("平均は0です。");
		}
		
	}
}
