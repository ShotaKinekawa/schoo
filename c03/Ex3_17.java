import java.util.Random;

class Ex3_17{
	public static void main(String[] args){
		
		Random rdm = new Random();
		
		int janken = rdm.nextInt(3);//0~2の乱数
		
		switch (janken){
			case 0 : 	System.out.println("グー");
						break;
			case 1 : 	System.out.println("チョキ");
						break;
			case 2 : 	System.out.println("パー");
						break;
		}
	}
}
