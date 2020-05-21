
import java.util.InputMismatchException;
import java.util.Scanner;

import myShape.*;

/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/12
 */
public class Ex13_01 {

	static Scanner stdIn = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n = 0;

		try {
			do {
				System.out.print("図形は何個？：");
				n = stdIn.nextInt();
			} while (n < 0);

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("入力値が不正です！");
			n = 0;

		}

		Shape[] shapes = new Shape[n];

		try {
			for (int i = 0; i < n; i++) {
				shapes[i] = makeShape(i + 1);
			}

			for (Shape shape : shapes) {
				shape.print();
				System.out.println();
			}

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("入力値が不正です！");
		}

	}

	/**
	 * 図形５種類（1...点 / 2...水平直線 / 3...垂直直線 / 4...長方形 / 5...平行四辺形） の作成。
	 * 
	 * @param n 作成している個数の順番(n番目)
	 * @return 図形の参照
	 */
	static Shape makeShape(int n) {
		int sw = 0;
		do {
			System.out.println(n + "番の図形の種類（1...点 / 2...水平直線 / 3...垂直直線 / 4...長方形 / 5...平行四辺形");
			sw = stdIn.nextInt();

		} while (sw < 1 || sw > 5);

		switch (sw) {
		case 1:
			return new Point();
		case 2:
			System.out.print("長さ：");
			int l = stdIn.nextInt();
			return new VertLine(l);
		case 3:
			System.out.print("長さ：");
			l = stdIn.nextInt();
			return new HorzLine(l);
		case 4:
			System.out.print("幅：");
			int w = stdIn.nextInt();
			System.out.print("高さ：");
			int h = stdIn.nextInt();
			return new Rectangle(w, h);
		case 5:
			System.out.print("幅：");
			w = stdIn.nextInt();
			System.out.print("高さ：");
			h = stdIn.nextInt();
			return new Parallelogram(w, h);
		default:
			return null;
		}

	}
}
