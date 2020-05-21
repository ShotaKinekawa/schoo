import java.util.Scanner;

/**
 * file
 */

/**
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/13
 */
public class Ex13_03 {

	static Scanner stdIn = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("コンピュータとじゃんけんします！");
		int r = 0;
		do {
			System.out.println("人間は参加しますか？");
			System.out.print("Yes...1 / No...0 : ");
			r = stdIn.nextInt();
		} while (r < 0 || r > 1);

		Player p1, p2;
		if (r == 1) {
			p1 = new HumanPlayer();
			System.out.println("1Pがあなたです。");
		} else {
			p1 = new CPUPlayer();
		}

		p2 = new CPUPlayer();

		while (true) {
			RPSGo(p1, p2);
			
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

	public static void RPSGo(Player p1, Player p2) {

		System.out.println("じゃんけん！！");
		boolean draw = true;
		p1.decideHand();
		p2.decideHand();

		System.out.println("ぽい！\t1P:" + p1 + "\t2P:" + p2);

		while (draw) {
			int j = Player.judgeWinner(p1.getHand(), p2.getHand());
			if (j != 0) {
				draw = false;
				if (j == 1) {
					System.out.println("1Pの勝ち！");
				} else {
					System.out.println("2Pの勝ち！");
				}
			} else {
				draw = true;
				System.out.println("あいこで！！");
				p1.decideHand();
				p2.decideHand();
				System.out.println("しょ！\t1P:" + p1 + "\t2P:" + p2);
			}

		}
	}

}
