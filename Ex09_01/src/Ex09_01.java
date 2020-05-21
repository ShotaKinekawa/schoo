
/**
 * file
 */
import java.util.Scanner;

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/11
 */
public class Ex09_01 {
	static Scanner stdIn = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human[] humans1 = { new Human("杵川翔太", 170.4, 69.1), new Human("人気歌手", 158.0, 42.0), };

		int num;
		do {
			System.out.print("何人のデータを作成しますか?(3人以上):");
			num = stdIn.nextInt();
		} while (num < 3);

		Human[] humans2 = new Human[num];

		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "人目");
			System.out.print("名前:");
			String name = stdIn.next();
			System.out.print("身長[cm]:");
			double height = stdIn.nextDouble();
			System.out.print("体重[kg]:");
			double weight = stdIn.nextDouble();

			humans2[i] = new Human(name, height, weight);
		}

		while (true) {

			System.out.println("==メニュー==");
			System.out.println("1...入力データ閲覧 / 2...入力データ更新 / 3... 既成データ閲覧 / 4...終了");
			System.out.print("入力:");
			int read = stdIn.nextInt();

			if (read == 4) {
				break;
			} else if (read == 3) {
				browseData(humans1);
			} else if (read == 1) {
				browseData(humans2);
			} else if (read == 2) {
				do {
					System.out.print("何人目のデータを更新しますか?:");
					read = stdIn.nextInt() - 1;
				} while (read < 0 || read >= num);

				System.out.println((read + 1) + "人目:" + humans2[read].getName() + "さんのデータを更新します。");
				System.out.print("身長[cm]:");
				double height = stdIn.nextDouble();
				System.out.print("体重[kg]:");
				double weight = stdIn.nextDouble();

				humans2[read].resetData(height, weight);

				System.out.println("更新完了しました。メニューに戻ります。");
				System.out.println();
			}
		}
	}

	static void browseData(Human[] h) {
		int idxMax = h.length;
		int read;
		while (true) {
			do {
				System.out.println("何人目のデータを閲覧しますか?:");
				read = stdIn.nextInt() - 1;
			} while (read < 0 || read >= idxMax);

			h[read].printData();

			int retry = 1;
			do {
				System.out.print("\nもう一度？Yes...1/No...0 :");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);

			if (retry == 0) {
				System.out.println("メニューに戻ります。");
				System.out.println();
				break;
			}
		}
	}
}
