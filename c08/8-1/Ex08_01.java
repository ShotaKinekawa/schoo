import java.util.Scanner;

class Ex08_01{
	
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int num;
		do{
			System.out.print("���l�̃f�[�^���쐬���܂���?:");
			num = stdIn.nextInt();
		}while(num < 0);
		
		Human[] humans = new Human[num];
		
		for(int i = 0; i < num; i++){
			System.out.println((i + 1) + "�l��");
			System.out.print("���O:");
			String name = stdIn.next();
			System.out.print("�g��[cm]:");
			double height = stdIn.nextDouble();
			System.out.print("�̏d[kg]:");
			double weight = stdIn.nextDouble();
			
			humans[i] = new Human(name, height, weight);
		}
		
		while(true){
			
			System.out.println("==���j���[==");
			System.out.println("1...�{�� / 2...�X�V / 3...�I��");
			System.out.print("����:");
			int read = stdIn.nextInt();
			
			if(read == 3){
				break;
			}else if(read == 1){
				while(true){
					do{
						System.out.print("\n���l�ڂ̃f�[�^���{�����܂���?:");
						read = stdIn.nextInt() - 1;
					}while(read < 0 || read >= num);
					
					humans[read].printData();
					
					int retry = 1;
					do{
						System.out.print("\n������x�HYes...1/No...0 :");
						retry = stdIn.nextInt();
					}while(retry != 0 && retry != 1);
					
					if(retry == 0){
						System.out.println("���j���[�ɖ߂�܂��B");
						System.out.println();
						break;
					}
				}
			}else if(read == 2){
				do{
					System.out.print("���l�ڂ̃f�[�^���X�V���܂���?:");
					read = stdIn.nextInt() - 1;
				}while(read < 0 || read >= num);
				
				System.out.println( (read + 1)  + "�l��:"+
					humans[read].getName() +"����̃f�[�^���X�V���܂��B");
				System.out.print("�g��[cm]:");
				double height = stdIn.nextDouble();
				System.out.print("�̏d[kg]:");
				double weight = stdIn.nextDouble();
				
				humans[read].resetData(height, weight);
				
				System.out.println("�X�V�������܂����B���j���[�ɖ߂�܂��B");
				System.out.println();
			}
		}
		
		
	}
	
}
