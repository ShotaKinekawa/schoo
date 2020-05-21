
/** 
 * 
 *  Petクラス
 */

/**
 * @author Shota_Kinekawa
 *
 */
public class Pet {

	private String name;
	private String masterName;
	

	/**
	 *コンストラクタ
	 */
	public Pet(String n, String mN) {
		// TODO 自動生成されたコンストラクター・スタブ
		
		this.name = n;
		this.masterName = mN;
	}


	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return masterName
	 */
	public String getMasterName() {
		return masterName;
	}
	
	public void introduce() {
		
		System.out.println("■僕の名前は" + name + "です！");
		System.out.println("■ご主人様は" + masterName + "です！");
	}
}
