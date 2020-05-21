import java.util.Scanner;

/**
 * 
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/11
 */
public class Ex09_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		// Day型インスタンスを利用した動作確認
		System.out.println("日付day1を入力せよ。");
		System.out.print("年:");
		int y = stdIn.nextInt();
		System.out.print("月:");
		int m = stdIn.nextInt();
		System.out.print("日:");
		int d = stdIn.nextInt();

		Day day1 = new Day(y, m, d);
		System.out.println("day1 = " + day1);

		Day day2 = new Day(day1);
		System.out.println("day2をday1と同じ日付として作りました。");
		System.out.println("day2 = " + day2);

		if (day1.equalTo(day2)) {
			System.out.println("day1 = day2");
		} else {
			System.out.println("day1 != day2");
		}

		Day d1 = new Day();
		Day d2 = new Day(2020);
		Day d3 = new Day(2020, 5);
		Day d4 = new Day(2020, 5, 11);

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);

		Day[] a = new Day[3];

		for (int i = 0; i < a.length; i++) {
			a[i] = new Day();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

		stdIn.close();
	}

}
