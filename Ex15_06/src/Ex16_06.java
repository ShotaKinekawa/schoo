/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex16_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		if (args.length < 1) {
			System.out.println("引数に数値を入力してください。");
		} else {
			double r = Double.parseDouble(args[0]);
			System.out.println("半径r = " + r);
			System.out.println("円周の長さ：" + 2 * Math.PI * r);
			System.out.println("円の面積：" + Math.PI * r * r);
		}
	}

}
