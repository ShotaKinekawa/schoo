import java.util.Scanner;
import java.util.Random;

class Ex6_15{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] weekEnStr = {
			"monday", "tuesday", "wednesday", "thursday",
			"friday", "saturday", "sunday",
		};
		String[] weekJpStr = {
			"��", "��", "��", "��", "��", "�y", "��",
		};
		
		int retry = 0; //���g���C�̃t���O,0:�I���,1:�p��
		int former = 13; //�O��̐���j��
		int week;//���Ă�ׂ��j��:0~6
		
		System.out.println("�p��̗j�������������œ��͂��Ă��������B");
				
		do{
			week = rand.nextInt(7);
			if (former == week){
				continue; //����j���Ȃ�A�I�тȂ���
			}
			
			while(true){
				System.out.print( weekJpStr[week] + "�j���F");
				String w = stdIn.next();
				
				if(w.equals(weekEnStr[week])){
					break;
				}
				System.out.println("�Ⴂ�܂�");
			}
			
			
			System.out.print("�����ł��B������x�H 1...Yes / 0...No:");
			retry = stdIn.nextInt();
			former = week;
		}while(retry == 1);
	}
}
