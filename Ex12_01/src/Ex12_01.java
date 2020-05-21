import java.util.Scanner;

public class Ex12_01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Ԃ̃f�[�^����͂��Ă��������B");
		
		System.out.print("���O:");
		String name = stdIn.nextLine();
		
		System.out.print("�ԕ�[mm]:");
		int width = stdIn.nextInt();
		System.out.print("����[mm]:");
		int height = stdIn.nextInt();
		System.out.print("����[mm]:");
		int length = stdIn.nextInt();
		System.out.print("�R��[L]:");
		double fuel = stdIn.nextDouble();
		System.out.println("�w���N����");
		System.out.print("�N:");
		int	year = stdIn.nextInt();
		System.out.print("��:");
		int	month = stdIn.nextInt();
		System.out.print("��:");
		int date = stdIn.nextInt();
		
		DerivedCar dCar = new DerivedCar(name, width, height, length, fuel, new Day(year, month, date));
		
		while(true) {
			System.out.println("==���j���[==");
			System.out.println("1...�X�y�b�N�{�� / 2...�ړ� / 3...�w���N���� / 4...�I��");
			System.out.print("����:");
			int read = stdIn.nextInt();
			
			if(read == 4){
				break;
			}else if (read == 3) {
				System.out.println("�w���N����:" + dCar.getPurchaseDay());
			}else if (read == 2){
				System.out.println("���ړ�����"+dCar.getTotalDist() + "km");
				System.out.print("X�����̈ړ�����[km]�F");
				double dx = stdIn.nextDouble();
				System.out.print("Y�����̈ړ�����[km]�F");
				double dy = stdIn.nextDouble();
				
				if(!dCar.move(dx, dy)){
					System.out.println("�R��������܂���I");
				}
			}else if(read == 1){
				dCar.putSpec();
			}
		
			stdIn.close();
		}
	}
}
