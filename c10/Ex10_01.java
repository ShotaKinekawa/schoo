class ID{
	static int counter = 0;	//���Ԃ܂ł̎��ʔԍ���^������
							//ID�S�̋��L
	
	private int id; 		//���ʔԍ�
	
	public ID(){
		id = ++counter;		//���ʔԍ��̕t�^
	}
	
	public int getID(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}
}

public class Ex10_01{
	
	public static void main(String[] args){
		ID a = new ID();
		ID b = new ID();
		
		System.out.println("a�̎��ʔԍ��F" + a.getID());
		System.out.println("b�̎��ʔԍ��F" + b.getID());
		
		System.out.println("ID.counter = " + ID.counter);
		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);
		
		System.out.println("ID.getMaxId() = " + ID.getMaxId());
	}
	
}
