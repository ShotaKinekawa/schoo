/**
 * file
 */
package myShape;

/**
 * 左下直角の三角形のクラス
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/12
 */
public class LowLeftIRT extends IsoscelesRightTriangle {

	/**
	 * コンストラクタ
	 * 
	 * @param ed 2等辺の長さ
	 */
	public LowLeftIRT(int ed) {
		super(ed);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= edge; i++) {
			putChars('*', i);
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "LowLeftIRT [2edges：" + edge + "]";
	}

}
