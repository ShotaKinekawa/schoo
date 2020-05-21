import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Day{
	private int year;
	private int month;
	private int date;
	private static int[] lastDateOfMonth
	= {	31, 28, 31, 30, 31, 30, 
		31, 31, 30, 31, 30, 31,};
	static GregorianCalendar today;
	
	//�N���X�������q
	static{
		today = new GregorianCalendar();
	}
	
	//�N���X���\�b�h
	
	//y�N�͂��邤�N?	
	public static boolean isLeap(int y){
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	//y�Nm��d���̔N���̌o�ߓ��������߂�
	public static int nthDayFromNewYearTo(int y, int m, int d){
		Day tmp = new Day(y,m,d);
		return tmp.nthDayFromNewYearTo();
	}
	
	//y�Nm��d���̔N���̎c����������߂�
	public static int daysLeftInYear(int y, int m, int d){
		int left = 365 - nthDayFromNewYearTo(y,m,d);
		return (isLeap(y)? left + 1 : left);
	}
	
	//���̓��t�Ƃ̑O��֌W��\��
	public static void getRelationOf(Day d1, Day d2){
		d1.getRelationOf(d2);
	}
	
	public static void getRelationOf(Day d1, int y, int m, int d){
		d1.getRelationOf(y, m ,d);
	}
	
	public static void getRelationOf(int y1,int m1, int d1, int y2, int m2, int d2){
		Day d = new Day(y1, m1, d1);
		d.getRelationOf(y2, m2, d2);
	}
	
	//���̓���ԋp���郁�\�b�h
	public static Day nextDay(Day d){
		Day tmp = new Day(d);
		tmp.setNextDay();
		return tmp;
	}
	
	public static Day nextDay(int y, int m, int d){
		Day tmp = new Day(y,m,d);
		tmp.setNextDay();
		return tmp;
	}
	
	//n����̓��t��ԋp���郁�\�b�h
	public static Day nDaysAfter(int n, Day d){
		Day tmp = new Day(d);
		tmp.nDaysAfter(n);
		return tmp;
	}
	
	public static Day nDaysAfter(int n, int y, int m, int d){
		Day tmp = new Day(y, m, d);
		tmp.nDaysAfter(n);
		return tmp;
	}
	
	
	//�O����ԋp���郁�\�b�h
	public static Day lastDay(Day d){
		Day tmp = new Day(d);
		tmp.setLastDay();
		return tmp;
	}
	
	public static Day lastDay(int y, int m, int d){
		Day tmp = new Day(y, m, d);
		tmp.setLastDay();
		return tmp;
	}
	
	//n���O�̓��t��ԋp���郁�\�b�h
	public static Day nDaysBefore(int n, Day d){
		Day tmp = new Day(d);
		tmp.nDaysBefore(n);
		return tmp;
	}
	
	public static Day nDaysBefore(int n, int y, int m, int d){
		Day tmp = new Day(y,m,d);
		tmp.nDaysBefore(n);
		return tmp;
	}
	
	//�R���X�g���N�^
	public Day(){
		set(today.get(YEAR), today.get(MONTH) + 1, today.get(DATE));
	}
	public Day(int year){
		set(year, today.get(MONTH) + 1, today.get(DATE));
	}
	public Day(int year, int month){
		set(year, month, today.get(DATE));
	}
	public Day(int year, int month, int date){
		set(year, month, date);
	}
	public Day(Day d){
		this(d.year, d.month, d.date);
	}
	
	//�C���X�^���X���\�b�h
	
	//�N�����擾
	public int getYear(){ 	return year;}
	public int getMonth(){	return month;}
	public int getDate(){	return date;}
	
	//�N�����ݒ�
	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		if(month <= 1){
			this.month = 1;
		}else if(month >= 12){
			this.month = 12;
		}else{
			this.month = month;
		}
	}
	public void setDate(int date){
		if(isLeap() && month == 2 && date >= 29){
			this.date = 29;
		}else if(date <= 1){
			this.date = 1;
		}else if(lastDateOfMonth[this.month - 1] < date){
			this.date = lastDateOfMonth[this.month - 1];
		}else{
			this.date = date;
		}
	}
	
	public void set(int year, int month, int date){
		setYear(year);
		setMonth(month);
		setDate(date);
	}
	
	//�C���X�^���X�͂��邤�N�H
	public boolean isLeap(){ return isLeap(year);}
	
	//�j���H	0:Sum ~ 6:Sat
	public int dayOfWeek(){
		int y = year;
		int m = month;
		
		if(m == 1 || m == 2){
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	//���td�Ɠ����H
	public boolean equalTo(Day d){
		return year == d.year && month == d.month && date == d.date;
	}
	
	//���td��葁���H
	public boolean earlierThan(Day d){
		if(year < d.year){
			return true;
		}else if(year == d.year){
			if(month < d.month){
				return true;
			}else if(month == d.month){
				if(date < d.date){
					return true;
				}
			}
		}
		
		return false;
	}
	
	//�C���X�^���X�͌������牽���ځH
	public int nthDayFromNewYearTo(){
		if(month == 1){
			return date;
		}else if(month == 2){
			return lastDateOfMonth[0] + date;
		}else if(!isLeap(year)){
			int sum = 0;
			for(int i = 0; i < month - 1; i++){
				sum += lastDateOfMonth[i];
			}
			return sum + date;
		}else{
			int sum = 1;
			for(int i = 0; i < month - 1; i++){
				sum += lastDateOfMonth[i];
			}
			return sum + date;
		}
	}
	//�C���X�^���X�̔N���̎c������H
	public int daysLeftInYear(){
		return daysLeftInYear(year, month, date);
	}
	
	//���̓��t�Ƃ̑O��֌W��\��
	//~~~y�Nm��d��
	public void getRelationOf(int y, int m, int d){
		this.getRelationOf(new Day(y,m,d));
	}
	//~~~Day�^d
	public void getRelationOf(Day d){
		if(equalTo(d)){
			System.out.println("�������t["+ this +"]�ł�");
		}else if(earlierThan(d)){
			System.out.println(this + "��" + d + "��葁�����t�ł�");
		}else{
			System.out.println(this + "��" + d + "���x�����t�ł�");
		}
	}
	
	//���t��1���i�߂�
	public void setNextDay(){
		if(isLeap() && month == 2 && date == 28){
			setDate(29);
		}else if(date >= lastDateOfMonth[month - 1]){
			if(month == 12){
				set(year + 1, 1 ,1);
			}else{
				set(year, month + 1, 1);
			}
		}else{
			setDate(date + 1);
		}
	}
	
	//���t��n���i�߂�
	public void nDaysAfter(int n){
		for(int i = 0; i < n; i++){
			this.setNextDay();
		}
	}
	
	//���t���P���߂�
	public void setLastDay(){
		if(isLeap() && month == 3 && date == 1){
			set(year, 2, 29);
		}else if(date == 1){
			if(month == 1){
				set(year - 1, 12, 31);
			}else{
				set(year, month - 1, lastDateOfMonth[month - 2]);
			}
		}else{
			setDate(date - 1);
		}
	}
	
	//���t��n���߂�
	public void nDaysBefore(int n){
		for(int i = 0; i < n; i++){
			this.setLastDay();
		}
	}
	
	public String toString(){
		String[] wd = {"��","��","��","��","��","��","�y"};
		return String.format("%04d�N%02d��%02d��(%s)",
			year, month, date, wd[dayOfWeek()]);
	}
}
