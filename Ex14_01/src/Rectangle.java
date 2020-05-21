
/**
 * Class Rectangle は長方形を表すClass。
 * 
 * @author Shota_Kinekawa
 * @see Shape
 *
 */
public class Rectangle extends Shape implements Plane2D {

	/*
	 * int 長方形の幅
	 */
	private int width;

	/*
	 * int 長方形の高さ
	 */
	private int height;

	/**
	 * コンストラクタ
	 * 
	 * @param w 長方形の幅
	 * @param h 長方形の高さ
	 */
	public Rectangle(int w, int h) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.width = w;
		this.height = h;

	}

	/**
	 * 長方形の図形情報を表す文字列を返却するメソッド
	 * 
	 * @return String "Rectangle(width:%d,height%d)"
	 */
	public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}

	/**
	 * 長方形の長方形の描画を行うメソッド
	 */
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	/**
	 * 面積を計算するメソッド
	 */
	public int getArea() {
		return width * height;
	}
}
