import java.util.Scanner;
import java.util.Random;

class Ex6_14{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthStr = {
			"January", "February", "March", "April", 
			"May", "June", "July", "August",
			"September", "October", "November","December",
		};
		
		int retry = 0; //���g���C�̃t���O
		int former = 13; //�O��̐�����
		int month;//���Ă�ׂ���:0~11
		
		System.out.print("�p��̌�������͂��Ă��������B \n�Ȃ��A�擪�͑啶���ŁA2�����ڈȍ~�͏������Ƃ��܂��B\n");
				
		do{
			month = rand.nextInt(12); //���Ă�ׂ���:0~11
			if (former == month){
				continue; //���ꌎ�Ȃ�A�I�тȂ���
			}
			
			while(true){
				System.out.print( (month + 1)+ "���F");
				String m = stdIn.next();
				
				if(m.equals(monthStr[month])){
					break;
				}
				System.out.println("�Ⴂ�܂�");
			}
			
			System.out.print("�����ł��B������x�H 1...Yes / 0...No:");
			retry = stdIn.nextInt();
			former = month;
		}while(retry == 1);
	}
}
