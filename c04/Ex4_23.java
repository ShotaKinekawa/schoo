import java.util.Scanner;

class Ex4_23{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("数字ピラミッドを表示します。\n段数：");
			n = stdIn.nextInt();
		}while(n < 1);
		
		
		int col = (n - 1) * 2 + 1;//列数
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < col; j++){
				if(n - i - 1<= j && j <= n + i - 1){
					System.out.print((i+1)%10);
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
	}
}
