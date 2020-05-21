/**
 * file
 */
package myShape;

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/12
 */
public class UPRightIRT extends IsoscelesRightTriangle {

	/**
	 * コンストラクタ
	 * 
	 * @param ed
	 */
	public UPRightIRT(int ed) {
		super(ed);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= edge; i++) {
			putChars(' ', i - 1);
			putChars('*', edge - i + 1);
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "UPRightIRT [2edges：" + edge + "]";
	}

}
