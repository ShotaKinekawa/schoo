
/**
 * file
 */

/**
 * @author	Shota_Kinekawa
 * Date:2020/05/11
 */
/**
 * file
 */

import java.util.Scanner;

/**
 * @author Shota_Kinekawa Date:2020/05/08
 */

class Ex16_01 {
	// ---swの値に応じて例外を発生 -//
	static void check(int sw) throws Exception {
		switch (sw) {
		case 1:
			throw new Exception("検査例外発生!!");
		case 2:
			throw new RuntimeException("非検査例外発生!!");
		}
	}

	// checkを呼び出す //
	static void test(int sw) throws Exception {
		check(sw);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("sw:");
		int sw = stdIn.nextInt();
		try {
			test(sw);
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("RuntimeException " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
		stdIn.close();
	}
}
