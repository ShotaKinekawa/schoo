class Human{
	private String name;
	private double height;//[m]
	private double weight;//[kg]
	private double bmi;
	
	Human(String n, double h, double w){ // ���O�A�g��cm�A�̏dkg
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
		System.out.println("���O��"+ name + "�ł��B");
		System.out.println("�g����"+ height * 100 + "cm�ł��B");
		System.out.println("�̏d��"+ weight + "kg�ł��B");
		System.out.println("BMI�̎w�W��"+ (isHealthy()? "���N�ł��B": "���N�ł͂���܂���B"));
	}
	
	void resetData(double h, double w){
		height = h / 100;
		weight = w;
		bmi = weight / height / height;
	}
}
