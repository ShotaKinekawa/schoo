/**
 * file
 */

/**
 * @author	Shota_Kinekawa
 *
 * Date:2020/05/11
 */
public class Ex09_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account adachi = new Account("足立幸一",
				"123456", 1000, new Day(2020, 4, 1));
		
		System.out.println(adachi);
		
		Account nakata = new Account("仲田真二",
				"654321", 200, new Day(1999, 3, 23));
		
		System.out.println(nakata);
	}

}
