import java.util.Scanner;

class Ex08_02{
	
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("�Ԃ̃f�[�^����͂��Ă��������B");
		
		System.out.print("���O:");
		String name = stdIn.nextLine();
		int number;
		do{
			System.out.print("�Ԃ̃i���o�[(4��):");
			number = stdIn.nextInt();
		}while(number< 1000 || number > 9999);
		System.out.print("�ԕ�[mm]:");
		int width = stdIn.nextInt();
		System.out.print("����[mm]:");
		int height = stdIn.nextInt();
		System.out.print("����[mm]:");
		int length = stdIn.nextInt();
		System.out.print("�^���N�e��[L]:");
		double capacity = stdIn.nextDouble();
		System.out.print("�R��[km/L]:");
		double efficiency = stdIn.nextDouble();
		
		Car myCar = new Car(name, number, width, height, length, capacity, efficiency);
		
		
		while(true){
			
			myCar.putSituation();
			
			System.out.println("==���j���[==");
			System.out.println("1...�X�y�b�N�{�� / 2...�ړ� / 3...���� / 4...�I��");
			System.out.print("����:");
			int read = stdIn.nextInt();
			
			if(read == 4){
				break;
			}else if(read == 3){
				System.out.print("��L�������܂����H�F");
				double a = stdIn.nextDouble();
				myCar.refill(a);
			}else if (read == 2){
				System.out.print("X�����̈ړ�����[km]�F");
				double dx = stdIn.nextDouble();
				System.out.print("Y�����̈ړ�����[km]�F");
				double dy = stdIn.nextDouble();
				
				if(!myCar.move(dx, dy)){
					System.out.println("�R��������܂���I");
				}
			}else if(read == 1){
				myCar.putSpec();
			}
		}
		
		
	}
	
}
