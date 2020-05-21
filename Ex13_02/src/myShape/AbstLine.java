package myShape;
/**
 * 直線を表す抽象クラス
 * 
 */

/**
 * @author Shota_Kinekawa
 * @see	myShape
 * @see HorzLine VertLine
 */
public abstract class AbstLine extends Shape {

	/**
	 * 直線の長さ
	 */
	private int length;

	/**
	 * コンストラクタ
	 */
	public AbstLine(int l) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.length = l;
	}

	/**
	 * @return length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length セットする length
	 */
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "Abstline(length:" + length + ")";
	}


}
