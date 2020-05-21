/**
 * file
 */
package myShape;

/**
 * 左上直角の三角形のクラス
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/12
 */
public class UpLeftIRT extends IsoscelesRightTriangle {

	/**
	 * コンストラクタ
	 * 
	 * @param ed 2等辺の長さ
	 */
	public UpLeftIRT(int ed) {
		super(ed);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= edge; i++) {
			putChars('*', edge - i + 1);
			putChars(' ', i);
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "UpLeftIRT [2edges：" + edge + "]";
	}

}
