class Ex5_06{
	public static void main(String[] args){
		
		float xF = 0.0F;
		float xI;
		int i = 0;
		
		String sF = "float";
		String sI = "int";
		
		System.out.printf("%8s\t%8s\n",sF,sI);
		System.out.println("------------------------------");
		while(xF <= 1.0F && i <= 1000){
			
			xI = (float)i /1000;
			System.out.printf("%.7f\t%.7f",xF,xI);
			
			
			xF += 0.001F;
			i++;
			System.out.println();
		}
	}
}
