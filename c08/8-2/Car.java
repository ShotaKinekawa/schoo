class Car{
	private String name;
	private int number;
	private int width;//[mm]
	private int height;//[mm]
	private int length;//[mm]
	private double posx;//position:x[km]
	private double posy;//position;y[km]
	private double fuel;//amount of left fuel[L]
	private double capacity;//the capacity of the fuel tank[L]
	private double efficiency; //�R��[km/L]
	
	Car(String name, int width, int height, int length, double capa, double eff){
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = capa;
		this.capacity = capa;
		this.efficiency = eff;
		posx = posy = 0.0;
	}
	
	Car(String name, int num, int width, int height, int length, double capa, double eff){
		this(name, width, height, length, capa, eff);
		this.number = num;
	}
	
	double getX(){return posx;}
	double getY(){return posy;}
	double getFuel(){return fuel;}
	int	getNumber(){return number;}
	
	void putSituation(){
		System.out.print("\n==���݂�"+ name +"("+ number +")" +"�̏�==\n");
		System.out.print("���ݒn(" + getX() + "," + getY() 
				+ ") \n �c��R���F" + getFuel() + "L\n\n");
	}

	
	void putSpec(){
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width + "mm");
		System.out.println("�ԍ��G" + height + "mm");
		System.out.println("�Ԓ��F" + length + "mm");
	}
	
	boolean move(double dx, double dy){
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		if(dist / efficiency > fuel){
			return false;
		}else{
			fuel -= dist / efficiency;
			posx += dx;
			posy += dy;
			return true;
		}
	}
	
	void refill(double amount){
		if(fuel == capacity){
			System.out.println(name+"�͊��ɖ��^���ł��B");
		}else if(fuel + amount > capacity){
			System.out.println(name + "��" + (capacity - fuel) + "L�������A���^���ɂȂ�܂����B");
			fuel = capacity;
		}else{
			System.out.println(name + "��" + amount + "L�������܂����B");
			fuel += amount;
		}
	}
}
