import java.util.Scanner;

class Ex2_6{
	
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます。");
		System.out.printf("底辺:");
		double l = stdIn.nextDouble();
		
		System.out.printf("高さ:");
		double h = stdIn.nextDouble();

		
		System.out.println("面積は"+ l*h/2 +"です。");

	}
}
