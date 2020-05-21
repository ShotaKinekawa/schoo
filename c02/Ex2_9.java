import java.util.Random;

class Ex2_9{
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		double x = rand.nextDouble();//0~1‚Ì—”
		System.out.println("0.0ˆÈã1.0–¢–‚ÌÀ”’l:" + x );
		
		x = rand.nextDouble();//0~1‚Ì—”
		System.out.println("0.0ˆÈã10.0–¢–‚ÌÀ”’l:" + x*10 );
		
		x = rand.nextDouble();//0~1‚Ì—”
		System.out.println("-1.0ˆÈã1.0–¢–‚ÌÀ”’l:" + (x*2-1) );
	}
}
