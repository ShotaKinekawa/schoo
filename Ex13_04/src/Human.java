/**
 * file
 */

/**
 * 人間の情報に関するクラス
 * @author Shota_Kinekawa
 *
 *         Date:2020/05/11
 */
public class Human {
	private String name;
	private double height;// [m]
	private double weight;// [kg]
	private double bmi;
	private Day birthday;

	/**
	 *コンストラクタ
	 * @param n 名前
	 * @param h 身長(cm)
	 * @param w 体重(kg)
	 */
	Human(String n, double h, double w) { 
		setName(n);
		setHeight(h);
		setWeight(w);
		bmi = weight / height / height;
	}

	/**
	 * コンストラクタ
	 * @param n 名前
	 * @param h 身長(cm)
	 * @param w 体重(kg)
	 * @param b 誕生日（Day型）
	 * @see Day
	 */
	public Human(String n, double h, double w, Day b) {
		// TODO 自動生成されたコンストラクター・スタブ
		this(n, h, w);
		birthday = b;
	}

	/**
	 * @return birthday
	 * @see Day
	 */
	public Day getBirthday() {
		return birthday;
	}

	/**
	 * birthdayをセット
	 * 
	 * @param birthday 誕生日(Day型)
	 * @see Day
	 */
	public void setBirthday(Day birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Human [名前：" + name + ", 身長：" + getHeight() + "cm, 体重：" + weight + "kg, bmi：" + getBMI() + ", 誕生日：" + birthday + "]";
	}

	/**
	 * @return name 名前
	 */
	String getName() {
		return name;
	}

	/**
	 * @return height 身長（cm）
	 */
	double getHeight() {
		return height * 100;
	}

	/**
	 * @return BMI(小数点以下四捨五入)
	 */
	int getBMI() {
		return (int)Math.round(bmi);
	}

	/**
	 * @return BMIが通常値であるか？
	 */
	boolean isHealthy() {
		return 18.5 <= bmi && bmi < 25;
	}

	/**
	 * Human型のインスタンスの情報を標準出力する。
	 */
	void printData() {
		System.out.println("名前は" + name + "です。");
		System.out.println("身長は" + height * 100 + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("BMIの指標で" + (isHealthy() ? "健康です。" : "健康ではありません。"));
	}

	/**
	 * nameをセット
	 * 
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * heightを[m]でセット
	 * 
	 * @param height [cm]
	 */
	public void setHeight(double height) {
		this.height = height / 100;
	}

	/**
	 * weightを[kg]でセット
	 * 
	 * @param weight [kg]
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * 身長と体重を入力しなおすメソッド。
	 * @param h [cm]
	 * @param w [kg]
	 */
	void resetData(double h, double w) {
		setHeight(h);
		;
		setWeight(w);
		bmi = weight / height / height;
	}
}
