import java.util.Random;

class Ex3_17{
	public static void main(String[] args){
		
		Random rdm = new Random();
		
		int janken = rdm.nextInt(3);//0~2�̗���
		
		switch (janken){
			case 0 : 	System.out.println("�O�[");
						break;
			case 1 : 	System.out.println("�`���L");
						break;
			case 2 : 	System.out.println("�p�[");
						break;
		}
	}
}
