import java.util.Random;

class Ex2_7{
	
	public static void main(String[] args){
		
		Random rand = new Random();
		
		int x = rand.nextInt(9);//0~8�̐�������
		System.out.println("1���̐��̗����l:" + (x+1) );
		
		x = rand.nextInt(9);//0~8�̐�������
		System.out.println("1���̕��̗����l:" + (x+1)*(-1) );
		
		x = rand.nextInt(90);//0~89�̐�������
		System.out.println("2���̐��̗����l:" + (x+10) );
	}
}
