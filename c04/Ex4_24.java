import java.util.Scanner;

class Ex4_24{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("素数であるか判定します。\n正の整数：");
			n = stdIn.nextInt();
		}while(n < 1);
		
		int flg = 1; //素数なら1、そうでなければ0
		
		if(n > 1){
			for(int i = 2; i * i <= n; i++){
				if(n % i == 0){
					flg = 0;
					break;
				}
			}
		}else{
			flg = 0; //n=1は素数
		}
		
		System.out.println(n + "は" + (flg == 1? "素数です。":"素数ではありません。"));
	}
}
