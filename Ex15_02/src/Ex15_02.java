import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex15_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("文字列を入力してください : ");
		Scanner stdIn = new Scanner(System.in);
		String string = stdIn.next();

		printCharCode(string);

		stdIn.close();
	}

	/**
	 * 文字列の文字コードを判別するメソッド
	 * @param string 文字コードを確認したい文字列
	 *  @see <a href ="https://techacademy.jp/magazine/34102">Javaで文字コードを判定する方法について現役エンジニアが解説【初心者向け】 | TechAcademyマガジン</a> 
	 */
	static void printCharCode(String string) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			if (string.equals(characterEncode(string, "SJIS"))) {
				System.out.println("この文字列はShift-JISです。");
			} else if (string.equals(characterEncode(string, "UTF-16"))) {
				System.out.println("この文字列はUTF-16です。");
			} else if (string.equals(characterEncode(string, "UTF-8"))) {
				System.out.println("この文字列はUTF-8です。");
			}else {
				System.out.println("この文字列の文字コードは不明です。");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			System.err.println("メソッドでエンコードに失敗しました。");
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param string 変換したい文字列
	 * @param charCode 文字コード
	 * @return 文字コードに変換された文字列
	 * @throws UnsupportedEncodingException
	 */
	static String characterEncode(String string, String charCode) throws UnsupportedEncodingException {
		// TODO 自動生成されたメソッド・スタブ
		byte[] tmp = new String(string).getBytes(charCode);
		return new String(tmp);
	}

}
