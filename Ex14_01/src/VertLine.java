/**
 * @author	Shota_Kinekawa
 *	垂直直線
 */
public class VertLine extends AbstLine {

	/**
	 * @param l
	 */
	public VertLine(int l) {
		super(l);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= getLength(); i++) {
			System.out.println('|');
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "VertLine(length:" + getLength() + ")";
	}

}
