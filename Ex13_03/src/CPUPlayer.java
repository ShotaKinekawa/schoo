import java.util.Random;

/**
 * file
 */

/**
 * @author	Shota_Kinekawa
 *
 * Date:2020/05/13
 */
public class CPUPlayer extends Player {

	static Random random = new Random();
	
	/**
	 *コンストラクタ
	 */
	public CPUPlayer() {
		// TODO 自動生成されたコンストラクター・スタブ
		super();
	}

	@Override
	public void decideHand() {
		// TODO 自動生成されたメソッド・スタブ
		hand = random.nextInt(3);
		
	}

	
}
