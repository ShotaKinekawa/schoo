/**
 * 
 */

/**
 * @author	Shota_Kinekawa
 *
 */
public class Ex14_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Shape[] p = new Shape[5];
		
		p[0] = new HorzLine(8);
		p[1] = new Rectangle(4, 3);
		p[2] = new Point();
		p[3] = new VertLine(7);
		p[4] = new Parallelogram(5, 2);
		
		for (Shape shape : p) {
			shape.print();
			if (shape instanceof Plane2D) {
				System.out.println("面積：" +((Plane2D) shape).getArea());
			}
			System.out.println();
		}
		
	}

}
