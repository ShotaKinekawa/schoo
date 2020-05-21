import java.util.Scanner;

/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/11
 */
public class Ex16_04 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length; i++) {
				swap(a, i, a.length - i);
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO: handle exception
			throw new RuntimeException("reverseのバグ？", e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数(0ではnullを生成)：");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		if (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt();
			}
		} else {
			x = null;
		}

		try {
			reverse(x);

			System.out.println("要素の並びを反転しました。");

			for (int i = 0; i < num; i++) {
				System.out.println("x[" + i + "] = " + x[i]);
			}
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("例外\t：" + e);
			System.out.println("例外の原因：" + e.getCause());
		}

		stdIn.close();
	}
}
