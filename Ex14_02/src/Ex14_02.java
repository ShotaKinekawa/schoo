import java.util.Random;

/**
 * 
 */

/**
 * @author	Shota_Kinekawa
 *
 */
public class Ex14_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pet kurt = new Pet("Kurt", "アイ");
		kurt.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
		r2d2.introduce();
		System.out.println();
		
		System.out.println("R2D2をランダムに塗装します。");
		Random random = new Random();
		r2d2.changeSkin(random.nextInt(5));
		
	}

}
