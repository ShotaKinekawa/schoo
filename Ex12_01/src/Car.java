public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	protected double x;
	protected double y;
	protected double fuel;
	private Day purchaseDay;

	// コンストラクタ
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		// TODO 自動生成されたコンストラクター・スタブ

		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.purchaseDay = purchaseDay;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getFuel() {
		return fuel;
	}

	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}

	// show Specs
	public void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高；" + height + "mm");
		System.out.println("車長：" + length + "mm");

	}

	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);

		if (dist > fuel) {
			return false;
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}
