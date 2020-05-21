class Human{
	private String name;
	private double height;//[m]
	private double weight;//[kg]
	private double bmi;
	
	Human(String n, double h, double w){ // 名前、身長cm、体重kg
		name = n;
		height = h / 100;
		weight = w;
		bmi = weight / height / height;
	}
	
	String getName(){
		return name;
	}
	
	double getHeight(){
		return height;
	}
	
	double getBMI(){
		return Math.round(bmi);
	}
	
	boolean isHealthy(){
		return 18.5 <= bmi && bmi < 25;
	}
	
	void printData(){
		System.out.println("名前は"+ name + "です。");
		System.out.println("身長は"+ height * 100 + "cmです。");
		System.out.println("体重は"+ weight + "kgです。");
		System.out.println("BMIの指標で"+ (isHealthy()? "健康です。": "健康ではありません。"));
	}
	
	void resetData(double h, double w){
		height = h / 100;
		weight = w;
		bmi = weight / height / height;
	}
}
