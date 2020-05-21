/**
 * file
 */

/**
 * じゃんけんの参加者の抽象クラス
 * 
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/12
 */
public abstract class Player {

	/**
	 * グー:0
	 */
	public static final int Rock = 0;

	/**
	 * チョキ:1
	 */
	public static final int Scissors = 1;

	/**
	 * パー:2
	 */
	public static final int Paper = 2;

	/**
	 * じゃんけんの手の文字列
	 */
	public static final String[] strHand = {
			"グー",
			"チョキ",
			"パー",
	};
	/**
	 * じゃんけんの手。
	 * 
	 * Playerクラスの定数RockかScissorsかPaperを入れる。
	 * 
	 * @see Player
	 */
	protected int hand;

	/**
	 * コンストラクタ
	 */
	public Player() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * @return hand :じゃんけんの手。
	 */
	public int getHand() {
		return hand;
	}

	/**
	 * グーチョキパーを決める抽象メソッド
	 * 
	 */
	public abstract void decideHand();

	/**
	 * 2者のじゃんけんの勝者を決めるクラスメソッド
	 * 
	 * @param p1 引数1個目:グーチョキパーの手(0～2)のどれか。
	 * @param p2 引数2個目:グーチョキパーの手(0～2)のどれか。 引数が異常値だとエラーを吐く。
	 * 
	 * @return 0,1,2のどれか。 (0:引き分け, 1:引数1の勝ち, 2:引数2の勝ち）
	 * 
	 */
	public static int judgeWinner(int p1, int p2) {
		if (p1 == p2) {
			return 0;
		} else if (p1 == Rock) {
			if (p2 == Paper) {
				return 2;
			} else if (p2 == Scissors) {
				return 1;
			}
		} else if (p1 == Scissors) {
			if (p2 == Rock) {
				return 2;
			} else if (p2 == Paper) {
				return 1;
			}
		} else if (p1 == Paper) {
			if (p2 == Rock) {
				return 1;
			} else if (p2 == Scissors) {
				return 2;
			}
		}

		System.out.println();
		throw new RuntimeException("変なじゃんけんの手を出さないでください。");

	}

	/**
	 * 自分が勝ったか？
	 * @param p :Player型インスタンス
	 * @return 自分が勝った場合はtrue、あいこ・負けはfalse
	 */
	public boolean isWinner(Player p) {
		return judgeWinner(this.getHand(), p.getHand()) == 1;
	}

	@Override
	public String toString() {
		return strHand[getHand()];
	}
	
	
}
