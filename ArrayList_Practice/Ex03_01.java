import java.util.ArrayList;
import java.util.Scanner;

/**
 * file
 */

/**
 * Ex02_01のプログラムを以下の形でメソッド化せよ。〇の部分も考えよ。
 * ● キーボードから読み込んだ可変長配列を返却するメソッド
 * 		static 〇〇 inputDataUntil1000()の作成
 * ● キー値dを線形探索し、要素番号を返却するメソッド
 * 		static 〇〇 linearSearchR(double d, 〇〇)の作成
 * ● mainメソッドの中身は10行以内にすること
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/16
 */
public class Ex03_01 {
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Double> arrayList = inputDataUntil1000();
		System.out.println("線形探索に移ります。");
		System.out.print("探す数値：");
		double buf = stdIn.nextDouble();
		int i = linearSerchR(buf, arrayList);
		if (i >= 0)
			System.out.println("それは" + i + "個目にあります。");
		else
			System.out.println("それはありません。");
		stdIn.close();
	}

	/**
	 * @param d キー値
	 * @param arrayList 探索する配列
	 * @return 要素番号（発見できなかった場合は-1）
	 */
	private static int linearSerchR(double d, ArrayList<Double> arrayList) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
		for (i = arrayList.size() - 1; i >= 0; i--) {
			if (arrayList.get(i) == d) {
				break;
			}
		}
		return i;
	}

	/**
	 * @return 入力された配列
	 */
	private static ArrayList<Double> inputDataUntil1000() {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Double> a = new ArrayList<Double>();
		System.out.println("合計が1000になるまで値を読み込みます。");
		double sum = 0.0;
		double buf = 0.0;
		while (sum < 1000) {
			System.out.print(a.size() + "個目の要素 : ");
			buf = stdIn.nextDouble();
			a.add(buf);
			sum += buf;
		}
		System.out.println("入力値の合計が1000を超えました。");
		return a;
	}
}
