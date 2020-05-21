import java.util.Scanner;

/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex15_05 {
	static Scanner stdIn = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("コンピュータとじゃんけんします！");
		Player p1 = new HumanPlayer();
		System.out.println("1Pがあなたです。");
		Player p2 = new CPUPlayer();
		Player p3 = new CPUPlayer();

		while (true) {
			RPSGo(p1, p2, p3);
			int r;
			do {
				System.out.println("もう一度？");
				System.out.print("Yes...1 / No...0 : ");
				r = stdIn.nextInt();

			} while (r < 0 || r > 1);

			if (r == 0) {
				break;
			}
		}

	}

	/**
	 * @param p1
	 * @param p2
	 * @param p3
	 */
	static void RPSGo(Player p1, Player p2, Player p3) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("じゃんけん！！");
		boolean draw = true;
		p1.decideHand();
		p2.decideHand();
		p3.decideHand();

		System.out.println("ぽい！ 1P:" + p1 + " 2P:" + p2 + " 3P:" + p3);

		while (draw) {
			int j = Player.judgeWinner(p1.getHand(), p2.getHand(), p3.getHand());
			if (j != 0) {
				draw = false;
				switch(j) {
				case 1:
					System.out.println("1Pの1人勝ち！");
					break;
				case 2:
					System.out.println("2Pの1人勝ち！");
					break;
				case 3:
					System.out.println("3Pの1人勝ち！");
					break;
				case -1:
					System.out.println("2Pと3Pの勝ち！");
					break;
				case -2:
					System.out.println("1Pと3Pの勝ち！");
					break;
				case -3:	
					System.out.println("1Pと2Pの勝ち！");
				}
			} else {
				draw = true;
				System.out.println("あいこで！！");
				p1.decideHand();
				p2.decideHand();
				p3.decideHand();
				System.out.println("しょ！ 1P:" + p1 + " 2P:" + p2 + " 3P:" + p3);
			}

		}
	}
}
