import java.util.ArrayList;
import java.util.Scanner;

/**
 * file
 */

/**
 * 次の要件を満たすプログラムを作成せよ。
 * (1)配列の要素（小数）を、その合計が1000を超えるまで
 * 順にキーボードで読み込む。(1000を超えた時の値も読み込む)
 * (2)キーボードから入力されたキー値で線形探索し、
 * 最も末尾側に位置する要素を見つける。
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/16
 */
public class Ex02_01 {
	public static void main(String[] args) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		System.out.println("合計が1000になるまで値を読み込みます。");
		double sum = 0.0;
		Scanner stdIn = new Scanner(System.in);
		double buf = 0.0;
		while (sum < 1000) {
			System.out.print(arrayList.size() + "個目の要素 : ");
			buf = stdIn.nextDouble();
			arrayList.add(buf);
			sum += buf;
		}
		System.out.println("入力値の合計が1000を超えました。");
		System.out.println("線形探索に移ります。");

		System.out.print("探す数値：");
		buf = stdIn.nextDouble();

		stdIn.close();
		int i;
		for (i = arrayList.size() - 1; i >= 0; i--) {
			if (arrayList.get(i) == buf) {
				break;
			}
		}
		if (i >= 0) {
			System.out.println("それは" + i + "個目にあります。");
		}else {
			System.out.println("それはありません。");
		}

	}
}
