
/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/11
 */
public class Period {
	private Day from;
	private Day to;

	/**
	 * コンストラクタ
	 */
	Period() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.from = new Day();
		this.to = new Day();
	}

	Period(Day f) {
		this(f, new Day());
	}

	Period(Day f, Day t) {
		sets(f, t);
	}

	/**
	 * @param f
	 * @param t
	 */
	private void sets(Day f, Day t) {
		// TODO 自動生成されたメソッド・スタブ
		if (t.earlierThan(f)) {
			this.from = t;
			this.to = f;
		} else {
			this.from = f;
			this.to = t;
		}
	}

	/**
	 * @return from
	 */
	public Day getFrom() {
		return from;
	}

	/**
	 * from
	 * 
	 * @param from をセット
	 */
	public void setFrom(Day from) {
		this.from = from;
	}

	/**
	 * @return to
	 */
	public Day getTo() {
		return to;
	}

	/**
	 * to
	 * 
	 * @param to をセット
	 */
	public void setTo(Day to) {
		this.to = to;
	}

	public int between() {
		if (from.getYear() == to.getYear()) {
			return to.nthDayFromNewYearTo() - from.nthDayFromNewYearTo();
		} else {
			int ty = to.getYear(); // toの年の1月1日
			int fy = from.getYear() + 1; // fromの翌年の1月1日
			int sum = from.daysLeftInYear() + to.nthDayFromNewYearTo();

			while (fy < ty) {
				ty--;
				sum += (Day.isLeap(ty) ? 366 : 365);
			}

			return sum;
		}
	}

	@Override
	public String toString() {
		return  from + "から" + to + "まで"+ between() + "日です。";
	}
	
	
}
