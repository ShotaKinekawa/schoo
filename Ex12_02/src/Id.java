import java.util.Random;

public class Id {

	static int counter;	//���Ԃ܂ł̎��ʔԍ���^������
						//ID�S�̋��L
	
	private int id; 		//���ʔԍ�
	
	static {
		Random random = new Random();
		counter = random.nextInt(10) * 100;
	}
	
	public Id(){
		id = ++counter;		//���ʔԍ��̕t�^
	}
	
	public int getID(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}

}
