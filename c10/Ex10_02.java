import java.util.Scanner;

class ExID{
	static int counter = 0;	//���Ԃ܂ł̎��ʔԍ���^������
							//ID�S�̋��L
	static int n = 1;
	
	private int id; 		//���ʔԍ�
	
	public ExID(){			//�R���X�g���N�^
		id = n + counter;	//���ʔԍ��̕t�^
		counter += n;
	}
	
	public int getID(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}
	
	static int getN(){
		return n;
	}
	
	static void setN(int s){
		if(s < 1){
			System.out.println("�s���Ȓl�ł��B�ύX�ł��܂���B");
		}else{
			n = s;
			System.out.println( n + "�ɕύX���܂����B");
		}
	}
}

public class Ex10_02{
	
	public static void main(String[] args){
		int gen;	//�C���X�^���X������
		Scanner stdIn = new Scanner(System.in);
		
		do{
			System.out.print("�C���X�^���X�����������܂����H:");
			gen = stdIn.nextInt();
		}while(gen < 1);
		
		ExID[] a = new ExID[gen];
		
		for(int i = 0; i < gen; i++){
			a[i] = new ExID();
		}
		
		System.out.println("ID.getMaxId() = " + ExID.getMaxId());
		
		System.out.print("n��ύX���܂�:");
		int n = stdIn.nextInt();
		ExID.setN(n);
		
		do{
			System.out.print("�C���X�^���X�����Ɖ��������܂����H:");
			gen = stdIn.nextInt();
		}while(gen < 1);
		
		ExID[] b = new ExID[gen];
		
		for(int i = 0; i < gen; i++){
			b[i] = new ExID();
		}
		
		System.out.println("ID.getMaxId() = " + ExID.getMaxId());
	}
	
}
