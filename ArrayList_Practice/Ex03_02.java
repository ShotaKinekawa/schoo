import java.util.ArrayList;
import java.util.Random;

/**
 * file
 */

/**
 * 
 * ArrayList<Integer> aの要素iとjの値を入れ替えるメソッド
 * static void swap(int i, int j, ArrayList<Integer> a )を作成せよ。
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/16
 */
public class Ex03_02 {

	static Random random = new Random();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> arrayList = inputDataUntil(2000);

		printArray(arrayList);

		sort(arrayList);

		printArray(arrayList);

	}

	/**
	 * @param arrayList 昇順ソートが完了した可変長配列
	 */
	private static void sort(ArrayList<Integer> arrayList) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if(arrayList.get(i) > arrayList.get(j)) {
					swap(i,j,arrayList);
				}
			}
		}
		System.out.println("ソート完了！");
	}

	/**
	 * 答えそのものはこのメソッド
	 * @param i 要素番号
	 * @param j 要素番号
	 * @param arrayList 入れ替えたい配列
	 */
	private static void swap(int i, int j, ArrayList<Integer> arrayList) {
		// TODO 自動生成されたメソッド・スタブ
		int tmp = arrayList.get(i);
		arrayList.set(i, arrayList.get(j));
		arrayList.set(j, tmp);
	}

	/**
	 * @param arrayList 表示させたい配列
	 */
	private static void printArray(ArrayList<Integer> arrayList) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(i + "番目 : " + arrayList.get(i));
		}
	}

	/**
	 * 汎用化しています。
	 * @param max 閾値
	 * @return 入力された配列
	 */
	private static ArrayList<Integer> inputDataUntil(int max) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("合計が" + max + "になるまで値を読み込みます。");
		int sum = 0;
		int buf = 0;
		while (sum < max) {
			buf = random.nextInt(150);
			a.add(buf);
			sum += buf;
		}
		System.out.println("入力値の合計が1000を超えました。");
		return a;
	}
}
