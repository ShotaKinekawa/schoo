/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/11
 */
public class Ex09_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Period period1 = new Period();
		Period period2 = new Period(new Day(1994, 4, 19));
		Period period3 = new Period(new Day(1994, 4, 19), new Day(2007, 8, 31));
		Period period4 = new Period(new Day(1997, 1, 31), new Day(1994, 4, 19));
		
		System.out.println(period1);
		System.out.println(period2);
		System.out.println(period3);
		System.out.println(period4);
		
	}

}
