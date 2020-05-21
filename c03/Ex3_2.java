import java.util.Scanner;

class Ex3_2{
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("®”A:");
		int a = stdIn.nextInt();
		
		System.out.print("®”B:");
		int b = stdIn.nextInt();
		
		System.out.print("B‚ÍA‚Ì–ñ”");
		if(a%b==0){
			System.out.print("‚Å‚·B");
		}else{
			System.out.print("‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
		}

	}
}
