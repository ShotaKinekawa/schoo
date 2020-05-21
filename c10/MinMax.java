class MinMax{
	//int 
	public static int min(int a, int b){
		return a > b ? b : a;
	}
	
	public static int min(int a, int b, int c){
		int m = min(a, b);
		return min(m , c);
	}
	
	public static int min(int[] a){
		int m = a[0];
		
		for(int i = 1; i < a.length; i++){
			m = min(m, a[i]);
		}
		
		return m;
	}
	
	public static int max(int a, int b){
		return a > b? a : b;
	}
	
	public static int max(int a, int b, int c){
		int m = max(a, b);
		return max(m, c);
	}
	
	public static int max(int[] a){
		int m = a[0];
		
		for(int i = 1; i < a.length; i++){
			m = max(m, a[i]);
		}
		
		return m;
	}
	
	//doubleŒ^
	public static double min(double a, double b){
		return a > b ? b : a;
	}
	
	public static double min(double a, double b, double c){
		double m = min(a, b);
		return min(m , c);
	}
	
	public static double min(double[] a){
		double m = a[0];
		
		for(int i = 1; i < a.length; i++){
			m = min(m, a[i]);
		}
		
		return m;
	}
	
	public static double max(double a, double b){
		return a > b? a : b;
	}
	
	public static double max(double a, double b, double c){
		double m = max(a, b);
		return max(m, c);
	}
	
	public static double max(double[] a){
		double m = a[0];
		
		for(int i = 1; i < a.length; i++){
			m = max(m, a[i]);
		}
		
		return m;
	}
	
	//longŒ^
	public static long min(long a, long b){
		return a > b ? b : a;
	}
	
	public static long min(long a, long b, long c){
		long m = min(a, b);
		return min(m , c);
	}
	
	public static long min(long[] a){
		long m = a[0];
		
		for(int i = 1; i < a.length; i++){
			m = min(m, a[i]);
		}
		
		return m;
	}
	
	public static long max(long a, long b){
		return a > b? a : b;
	}
	
	public static long max(long a, long b, long c){
		long m = max(a, b);
		return max(m, c);
	}
	
	public static long max(long[] a){
		long m = a[0];
		
		for(int i = 1; i < a.length; i++){
			m = max(m, a[i]);
		}
		
		return m;
	}
}