import java.io.*;
import java.util.Scanner;

/**
 * file
 */

/**
 * ファイル入出力を使って前回の気分を表示
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/15
 */
public class LastTime1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		init();

		System.out.print("今の気分は：");
		String mind = stdIn.next();

		term(mind);
	}

	/**
	 * 前回の気分を読み込み、 それを表示する。
	 */
	private static void init() {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("LastTime.txt"));
			String mind = br.readLine();
			System.out.println("前回の気分は" + mind + "でした。");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("このプログラムを実行するのは初めてですね！");
		} finally {
			if (br != null) { // 読み込みファイルが存在していれば…
				try {
					br.close();
				} catch (IOException e2) {
					// TODO: handle exception
					System.out.println("ファイルクローズ失敗");
				}
			}

		}
	}

	/**
	 * @param mind 気分
	 */
	private static void term(String mind) {
		// TODO 自動生成されたメソッド・スタブ
		FileWriter fw = null;
		try {
			fw = new FileWriter("LastTime.txt");
			fw.write(mind);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("ファイル書き込みエラー発生！");
		} finally {
			if (fw != null) { // 書き込みファイルが存在していれば
				try {
					fw.close();
				} catch (IOException e2) {
					// TODO: handle exception
					System.out.println("ファイルクローズ失敗。");
				}
			}
		}
	}

}
