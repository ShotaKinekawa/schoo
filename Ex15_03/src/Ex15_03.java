import java.util.Scanner;

/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex15_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.print("文字列s1 : ");
		String s1 = stdIn.next();
		System.out.print("文字列s2 : ");
		String s2 = stdIn.next();

		findAndPrint(s1, s2);

		stdIn.close();
	}

	/**
	 * @param s1
	 * @param s2
	 */
	static void findAndPrint(String s1, String s2) {
		// TODO 自動生成されたメソッド・スタブ
		int p;
		if (s1.length() > s2.length()) {
			p = s1.indexOf(s2);
			if (p == -1) {
				System.out.println("s1中にs2は含まれません。");
			} else {
				System.out.println("s1 : " + s1);
				System.out.print("s2 : ");
				for (int i = 0; i < p; i++) {
					System.out.print(" ");
				}
				System.out.println(s2);
			}
		}else {
			p = s2.indexOf(s1);
			if (p == -1) {
				System.out.println("s2中にs1は含まれません。");
			} else {
				System.out.print("s1 : ");
				for (int i = 0; i < p; i++) {
					System.out.print(" ");
				}
				System.out.println(s1);
				System.out.println("s2 : " + s2);
			}
		}

	}
}
