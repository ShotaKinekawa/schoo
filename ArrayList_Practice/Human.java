/**
 * file
 */

/**
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

	Human(String n, double h, double w) { // 名前、身長cm、体重kg
		setName(n);
		setHeight(h);
		setWeight(w);
		bmi = weight / height / height;
	}

	/**
	 * コンストラクタ
	 */
	public Human(String n, double h, double w, Day b) {
		// TODO 自動生成されたコンストラクター・スタブ
		this(n, h, w);
		birthday = b;
	}

	/**
	 * @return birthday
	 */
	public Day getBirthday() {
		return birthday;
	}

	/**
	 * birthday
	 * 
	 * @param birthday をセット
	 */
	public void setBirthday(Day birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "[名前：" + name + ", 身長：" + getHeight() + "cm, 体重：" + weight + "kg, bmi：" + getBMI() + ", 誕生日：" + birthday
				+ "]";
	}

	public String printData() {
		return name + "," + height + "," + weight + "," + birthday.getYear() + "," + birthday.getMonth() + ","
				+ birthday.getDate();
	}

	String getName() {
		return name;
	}

	double getHeight() {
		return height * 100;
	}

	int getBMI() {
		return (int) Math.round(bmi);
	}

	boolean isHealthy() {
		return 18.5 <= bmi && bmi < 25;
	}

	/**
	 * name
	 * 
	 * @param name をセット
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * height[cm]
	 * 
	 * @param height を[m]でセット
	 */
	public void setHeight(double height) {
		this.height = height / 100;
	}

	/**
	 * weight[kg]
	 * 
	 * @param weight を[kg]でセット
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	void resetData(double h, double w) {
		setHeight(h);
		;
		setWeight(w);
		bmi = weight / height / height;
	}
}
