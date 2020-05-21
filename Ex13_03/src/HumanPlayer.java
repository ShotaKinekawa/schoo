import java.util.Scanner;

/**
 * file
 */

/**
 * じゃんけんの人間クラス
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class HumanPlayer extends Player {

	Scanner stdIn = new Scanner(System.in);

	/**
	 * コンストラクタ
	 */
	public HumanPlayer() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void decideHand() {
		// TODO 自動生成されたメソッド・スタブ

		do {
			System.out.println("グー：0, チョキ：1, パー：2");
			System.out.print("じゃんけんの手：");
			hand = stdIn.nextInt();
		} while (hand < Rock || hand > Paper);
	}
	

}
