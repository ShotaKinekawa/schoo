import java.util.ArrayList;
import java.util.Scanner;

/**
 * file
 */

/**
 * 次の要件を満たすプログラムを作成せよ。
 * (1)int[] array = { 2, 3, 5, 7, 11, 13, 17,};を可変長配列にコピーする。
 * (2)可変長配列に19を追加する。
 * (3)キーボードから入力された要素番号に対応する
 * 可変長配列の要素を表示する。ただし、配列の範囲外の整数が入力された場合、
 * 再入力させること。
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/16
 */
public class Ex02_02 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 7, 11, 13, 17 };
		ArrayList<Integer> copyArrayList = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			copyArrayList.add(array[i]);
		}

		Scanner stdIn = new Scanner(System.in);
		int idx;
		do {
			System.out.print("要素番号：");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= copyArrayList.size());
		System.out.println("番号" + idx + "の要素は" + copyArrayList.get(idx));
		stdIn.close();
	}
}
