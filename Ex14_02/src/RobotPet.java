
/**
 * 
 */

/**
 * @author Shota_Kinekawa
 *
 */
public class RobotPet extends Pet implements Skinnable {

	/**
	 * コンストラクタ
	 * 
	 * @param n
	 * @param mN
	 */
	public RobotPet(String n, String mN) {
		super(n, mN);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void introduce() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	public void work(int sw) {
		switch (sw) {
		case 0:
			System.out.println("掃除します。");
			break;
		case 1:
			System.out.println("洗濯します。");
			break;
		case 2:
			System.out.println("炊事します。");
			break;
		}
	}

	@Override
	public void changeSkin(int skin) {

		// TODO 自動生成されたメソッド・スタブ
		System.out.print("スキンを");

		switch (skin) {
		case BLACK:
			System.out.print("漆黒");
			break;
		case RED:
			System.out.print("深紅");
			break;
		case GREEN:
			System.out.print("柳葉");
			break;
		case BLUE:
			System.out.print("露草");
			break;
		case LEDPARD:
			System.out.print("豹柄");
			break;
		default:
			System.out.print("無地");
			break;
		}
		System.out.println("に変更しました。");
	}

}
