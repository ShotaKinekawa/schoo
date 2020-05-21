import java.util.Scanner;

/**
 * file
 */

/**
 * @author	Shota_Kinekawa
 *
 * Date:2020/05/11
 */
public class Ex15_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("文字列を入力してください : ");
		Scanner stdIn = new Scanner(System.in);
		String string = stdIn.next();
		
		reverseStr(string);
		
	}

	static void reverseStr(String str) {
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
