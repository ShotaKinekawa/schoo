package myShape;

/**
 * 直角二等辺三角形を表す抽象クラス
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/12
 */
public abstract class IsoscelesRightTriangle extends Shape implements Plane2D{

	/**
	 * 2等辺の長さ
	 */
	public int edge;

	/**
	 * @return edge
	 */
	public int getEdge() {
		return edge;
	}

	/**
	 * edgeをセット
	 * 
	 * @param edge
	 */
	public void setEdge(int edge) {
		this.edge = edge;
	}


	/**
	 *コンストラクタ
	 * @param ed 2等辺の長さ
	 */
	public IsoscelesRightTriangle(int ed) {
		// TODO 自動生成されたコンストラクター・スタブ
		setEdge(ed);
	}

	@Override
	public String toString() {
		return "Isosceles Right Triangle [2edges：" + edge + "]";
	}

	/**
	 * char cをn個横に並べて表示
	 * @param c
	 * @param n
	 */
	public void putChars(char c, int n) {
		while (n-- > 0) {
			System.out.print(c);
		}
	}

	@Override
	public int getArea() {
		// TODO 自動生成されたメソッド・スタブ
		return (int)Math.round(edge * edge / 2.0);
	}
}
