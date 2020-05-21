/**
 * クラスShapeは図形の概念を表す抽象クラス。
 * @author 	Shota_Kinekawa
 * @see 	Object
 */
public abstract class Shape {

	/**
	 * 図形情報を表す文字列を返却するメソッド。
	 */
	public abstract String toString() ;
	
	/**
	 * 図形を描写するメソッド。
	 */
	public abstract void draw() ;
	
	/**
	 * 図形情報の表示と図形描画を行う。
	 */
	public void print() {
		System.out.println(toString());
		draw();
	}
}
