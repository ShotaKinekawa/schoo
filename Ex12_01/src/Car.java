public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	protected double x;
	protected double y;
	protected double fuel;
	private Day purchaseDay;

	// �R���X�g���N�^
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u

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
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width + "mm");
		System.out.println("�ԍ��G" + height + "mm");
		System.out.println("�Ԓ��F" + length + "mm");

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
