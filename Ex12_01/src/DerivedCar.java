
public class DerivedCar extends Car {
	private double totalDist;

	public DerivedCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		this.totalDist = 0.0;
	}

	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);

		if (dist > super.fuel) {
			return false;
		} else {
			super.fuel -= dist;
			this.totalDist += dist;
			x += dx;
			y += dy;
			return true;
		}
	}

	public double getTotalDist() {
		return totalDist;
	}

}
