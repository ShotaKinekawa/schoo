import java.util.ArrayList;
import java.util.Scanner;

/**
 * file
 */

/**
 * 青本演習8-1(or 9-4)で作成した人間クラスの可変長配列にデータを入力後、
 * 背の低い順に並び替えてその氏名(+α)を表示するプログラムを作成せよ。
 * @author	Shota_Kinekawa
 *
 * Date:2020/05/16
 */
public class Ex04_01 {
	
	static Scanner stdIn = new Scanner(System.in);
	static int readInt; //stdInから読み込んだ整数値を格納

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Human> humans = new ArrayList<Human>(); 
		while (true) {
			humans.add(inputHuman());
			if(stopInput()) {
				break;
			}
		}
		sortHeight(humans);
		showResult(humans);

	}
	/**
	 * 配列を先頭から表示する。
	 * @param humans
	 */
	private static void showResult(ArrayList<Human> humans) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("背の低い順に並び変えると、");
		for (Human human : humans) {
			System.out.println(human.getName() + "\t" + human.getHeight() +"cm");
		}
	}
	/**
	 * 背の低い順にソートする。
	 * @param humans
	 */
	private static void sortHeight(ArrayList<Human> humans) {
		for (int i = 0; i < humans.size(); i++) {
			for (int j = i+1; j < humans.size(); j++) {
				if (humans.get(i).getHeight() > humans.get(j).getHeight()) {
					swap(i , j, humans);
				}
			}
		}
	}
	/**
	 * humansのi番目とj番目を入れ替える。
	 * @param i
	 * @param j
	 * @param humans
	 */
	private static void swap(int i, int j, ArrayList<Human> humans) {
		// TODO 自動生成されたメソッド・スタブ
		Human tmp = humans.get(i);
		humans.set(i, humans.get(j));
		humans.set(j, tmp);
	}
	/**
	 * @return データ入力をやめたいならtrue
	 */
	private static boolean stopInput() {
		int retry = 0;
		do {
			System.out.println("データ入力を続けますか？");	
			System.out.print("はい...1 / いいえ...0 : ");
			retry = stdIn.nextInt();
		} while (retry < 0 || retry > 1);
		return retry == 0;
	}
	/**
	 * @return データ入力された人間クラス
	 */
	private static Human inputHuman() {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("名前:");
		String name = stdIn.next();
		System.out.print("身長[cm]:");
		double height = stdIn.nextDouble();
		System.out.print("体重[kg]:");
		double weight = stdIn.nextDouble();

		return new Human(name, height, weight);
	}

}
