/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex15_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double sum = 0.0;
		for (String string : args) {
			sum += Double.parseDouble(string);
		}
		System.out.println("合計は" + sum + "です。");
	}

}
