package myShape;
/**
 * 
 */

/**
 * class Parallelogramは、平行四辺形を表す。
 * 
 * @author Shota_Kinekawa
 * @see Shape
 * @see Plame2D
 *
 */
public class Parallelogram extends Shape implements Plane2D {

	/**
	 * 底辺の幅
	 */
	private int width;

	/**
	 * 高さ
	 */
	private int height;

	/**
	 * コンストラクタ
	 */
	public Parallelogram(int width, int height) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.width = width;
		this.height = height;
	}

	/**
	 * 面積を求めるメソッド
	 */
	@Override
	public int getArea() {
		// TODO 自動生成されたメソッド・スタブ
		return width * height;
	}

	/**
	 * 文字列を返却するメソッド
	 */
	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "Parallelogram(width;" + width + ", height" + height + ")";
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= width; j++) {
				System.out.print('#');
			}
			System.out.println();
		}
	}

}
