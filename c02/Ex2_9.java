import java.util.Random;

class Ex2_9{
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		double x = rand.nextDouble();//0~1�̗���
		System.out.println("0.0�ȏ�1.0�����̎����l:" + x );
		
		x = rand.nextDouble();//0~1�̗���
		System.out.println("0.0�ȏ�10.0�����̎����l:" + x*10 );
		
		x = rand.nextDouble();//0~1�̗���
		System.out.println("-1.0�ȏ�1.0�����̎����l:" + (x*2-1) );
	}
}
