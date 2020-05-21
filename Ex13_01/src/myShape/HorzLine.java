package myShape;

/**
 * @author	Shota_Kinekawa
 * @see		AbstLine
 * @see		Shape
 *	水平直線
 */
public class HorzLine extends AbstLine {

	/**
	 * @param l
	 */
	public HorzLine(int l) {
		super(l);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= getLength(); i++) {
			System.out.print('-');
		}
		System.out.println();
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "HorizLine(length:" + getLength() + ")";
	}
}
