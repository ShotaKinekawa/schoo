/**
 * file
 */
package myShape;

/**
 * 右下直角の三角形のクラス
 * @author	Shota_Kinekawa
 *
 * Date:2020/05/12
 */
public class LowRightIRT extends IsoscelesRightTriangle {

	/**
	 *コンストラクタ
	 * @param ed
	 */
	public LowRightIRT(int ed) {
		super(ed);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= edge; i++) {
			putChars(' ', edge - i);
			putChars('*', i);
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "LowRightIRT [2edges：" + edge + "]";
	}
	

}
