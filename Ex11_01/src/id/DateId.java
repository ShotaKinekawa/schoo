/**
 * file
 */
package id;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/12
 */
public class DateId {

	private static int counter;
	private int id;

	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH) + 1;
		int d = today.get(DATE);

		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);

		counter = y * 1000000 + m * 10000 + d * 100;
	}
	
	/**
	 *コンストラクタ
	 */
	public DateId() {
		// TODO 自動生成されたコンストラクター・スタブ
		id = ++counter;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	
}
