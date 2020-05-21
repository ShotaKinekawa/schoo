import java.util.Scanner;

/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex15_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.print("浮動小数点数 : ");
		double x = stdIn.nextDouble();
		System.out.print("小数点以下の桁数 : ");
		int p = stdIn.nextInt();
		System.out.print("全体の桁数：");
		int w = stdIn.nextInt();

		printDouble(x, p, w);

		stdIn.close();
	}

	/**
	 * @param x
	 * @param p
	 * @param w
	 */
	static void printDouble(double x, int p, int w) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf(String.format("%%%d.%df\n", w, p), x);
	}

}
