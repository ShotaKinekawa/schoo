import java.util.ArrayList;
import java.util.Scanner;

/**
 * file
 */

/**
 * Ex02_02のメソッド版
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/16
 */
public class Ex03_00 {
	public static void main(String[] args) {
		ArrayList<Integer> b = listPrimeNum();
		b.add(19);
		check(b);
	}

	static ArrayList<Integer> listPrimeNum() {
		int[] array = { 2, 3, 5, 7, 11, 13, 17 };
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			tmp.add(array[i]);
		}
		return tmp;
	}

	static void check(ArrayList<Integer> a) {
		int idx;
		Scanner stdIn = new Scanner(System.in);
		do {
			System.out.print("要素番号：");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= a.size());
		System.out.println("番号" + idx + "の要素は" + a.get(idx));
		stdIn.close();
	}

}
