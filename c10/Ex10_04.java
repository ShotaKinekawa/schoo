import java.util.Scanner;

public class Ex10_04{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		
		//Day�^�C���X�^���X�𗘗p��������m�F
		System.out.println("���t����͂���B(Day�^�C���X�^���X���\�b�h)");
		System.out.print("�N:");
		int	y = stdIn.nextInt();
		System.out.print("��:");
		int m = stdIn.nextInt();
		System.out.print("��:");
		int d = stdIn.nextInt();
		
		Day a = new Day(y, m, d);
		System.out.println(a + "�Ƃ��Đ������܂����B");
		System.out.println(a.getYear() + "�N�͉[�N" +
			(a.isLeap()? "�ł��B": "�ł͂���܂���B"));
		System.out.println("��������" + a.nthDayFromNewYearTo()
			+ "���o�߂��Ă��܂��B");
		System.out.println("�N���c��" + a.daysLeftInYear()
			+ "���ł��B");
		
		Day b = new Day(a);
		b.setLastDay();
		System.out.println("�O��(�C���X�^���X���\�b�h)��" + b + "�A");
		System.out.println("�O��(�N���X���\�b�h)��" + Day.lastDay(a) + "�ł��B");
		Day c = new Day(a);
		c.setNextDay();
		System.out.println("����(�C���X�^���X���\�b�h)��" + c + "�A");
		System.out.println("����(�N���X���\�b�h)��" + Day.nextDay(a) + "�ł��B");
		
		int n;
		do{
			System.out.print("\n���̐����l�F");
			 n = stdIn.nextInt();
		}while(n < 1);
		Day e = new Day(a);
		e.nDaysBefore(n);
		System.out.println(n +"���O�̓��t��(�C���X�^���X���\�b�h��)" + e + "�A");
		System.out.println(n +"���O�̓��t��(�N���X���\�b�h��)" + Day.nDaysBefore(n, a) + "�ł��B");
		
		Day f = new Day(a);
		f.nDaysAfter(n);
		System.out.println(n +"����̓��t��(�C���X�^���X���\�b�h��)" + f + "�A");
		System.out.println(n +"����̓��t��(�N���X���\�b�h��)" + Day.nDaysAfter(n, a) + "�ł��B");
		
		
		//�N���X���\�b�h�𒆐S�Ƃ�������m�F
		System.out.println();
		System.out.println("���t����͂���B(Day�^�N���X���\�b�h)");
		System.out.print("�N:");
			y = stdIn.nextInt();
		System.out.print("��:");
			m = stdIn.nextInt();
		System.out.print("��:");
			d = stdIn.nextInt();
		System.out.println("���̔N�͉[�N" + 
			(Day.isLeap(y)? "�ł��B": "�ł͂���܂���B"));
		System.out.println("��������" + Day.nthDayFromNewYearTo(y,m,d)
			+ "���o�߂��Ă��܂��B");
		System.out.println("�N���c��" + Day.daysLeftInYear(y,m,d)
			+ "���ł��B");
		System.out.println("�O����" + Day.lastDay(y,m,d) + "�A");
		System.out.println("������" + Day.nextDay(y,m,d) + "�ł��B");
		
		
		
		
		System.out.println("�C���X�^���X���\�b�h");
		a.getRelationOf(y,m,d);
		//System.out.println();
		//Day.getRelationOf(a, y, m, d);
		System.out.println("�N���X���\�b�h");
		Day.getRelationOf(a.getYear(),a.getMonth(),a.getDate(), y, m, d);
		
		
	}
	
}
