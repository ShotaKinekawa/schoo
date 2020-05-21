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
	private double efficiency; //燃費[km/L]
	
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
		System.out.print("\n==現在の"+ name +"("+ number +")" +"の状況==\n");
		System.out.print("現在地(" + getX() + "," + getY() 
				+ ") \n 残り燃料：" + getFuel() + "L\n\n");
	}

	
	void putSpec(){
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高；" + height + "mm");
		System.out.println("車長：" + length + "mm");
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
			System.out.println(name+"は既に満タンです。");
		}else if(fuel + amount > capacity){
			System.out.println(name + "に" + (capacity - fuel) + "L給油し、満タンになりました。");
			fuel = capacity;
		}else{
			System.out.println(name + "に" + amount + "L給油しました。");
			fuel += amount;
		}
	}
}
