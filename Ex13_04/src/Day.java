
/**
 * file
 */

/**
 * 日付クラス
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/11
 */

public class Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;

	// コンストラクタ
	public Day() {
	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this(year);
		this.month = month;
	}

	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}

	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	// インスタンスメソッド

	// 年月日取得
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	// 年月日設定
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * month
	 * 
	 * @param month をセット
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * date
	 * 
	 * @param date をセット
	 */
	public void setDate(int date) {
		this.date = date;
	}

	public void set(int year, int month, int date) {
		setYear(year);
		setMonth(month);
		setDate(date);
	}

	// 曜日？ 0:Sum ~ 6:Sat
	public int dayOfWeek() {
		int y = year;
		int m = month;

		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// 日付dと同じ？
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	public String toString() {
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
