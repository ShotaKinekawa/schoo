/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex15_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Day day;

		if (args.length < 1) {
			day = new Day();
			showCalendar(day.getYear(), day.getMonth());

		} else if (args.length == 1) {
			day = new Day(Integer.parseInt(args[0]));
			showCalendar(day.getYear());

		} else{
			day = new Day(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			showCalendar(day.getYear(), day.getMonth());
		}
	}

	/**
	 * @param year
	 * @param month
	 */
	static void showCalendar(int year, int month) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf(" 西暦%04d年  %02d月\n", year, month);
		System.out.println("日 月 火 水 木 金 土 ");

		Day monthStart = new Day(year, month, 1);
		Day stepDay = new Day(year, month, 1);

		for (int i = 0; i < monthStart.dayOfWeek(); i++) {
			System.out.print("   ");
		}
		while (true) {
			if (monthStart.getMonth() < stepDay.getMonth() || monthStart.getYear() < stepDay.getYear()) {
				break;
			}
			System.out.printf("%2d ", stepDay.getDate());

			if (stepDay.dayOfWeek() == 6) {
				System.out.println();
			}

			stepDay.setNextDay();
		}
		System.out.println();
	}

	/**
	 * @param year
	 */
	static void showCalendar(int year) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 12; i++) {
			showCalendar(year, i);
			System.out.println();
		}
	}

}
