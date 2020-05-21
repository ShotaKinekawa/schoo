import java.util.Scanner;

class Ex4_24{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
			System.out.print("‘f”‚Å‚ ‚é‚©”»’è‚µ‚Ü‚·B\n³‚Ì®”F");
			n = stdIn.nextInt();
		}while(n < 1);
		
		int flg = 1; //‘f”‚È‚ç1A‚»‚¤‚Å‚È‚¯‚ê‚Î0
		
		if(n > 1){
			for(int i = 2; i * i <= n; i++){
				if(n % i == 0){
					flg = 0;
					break;
				}
			}
		}else{
			flg = 0; //n=1‚Í‘f”
		}
		
		System.out.println(n + "‚Í" + (flg == 1? "‘f”‚Å‚·B":"‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB"));
	}
}
