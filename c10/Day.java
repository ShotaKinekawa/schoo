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
	
	//クラス初期化子
	static{
		today = new GregorianCalendar();
	}
	
	//クラスメソッド
	
	//y年はうるう年?	
	public static boolean isLeap(int y){
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	//y年m月d日の年内の経過日数を求める
	public static int nthDayFromNewYearTo(int y, int m, int d){
		Day tmp = new Day(y,m,d);
		return tmp.nthDayFromNewYearTo();
	}
	
	//y年m月d日の年内の残り日数を求める
	public static int daysLeftInYear(int y, int m, int d){
		int left = 365 - nthDayFromNewYearTo(y,m,d);
		return (isLeap(y)? left + 1 : left);
	}
	
	//他の日付との前後関係を表示
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
	
	//次の日を返却するメソッド
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
	
	//n日後の日付を返却するメソッド
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
	
	
	//前日を返却するメソッド
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
	
	//n日前の日付を返却するメソッド
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
	
	//コンストラクタ
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
	
	//インスタンスメソッド
	
	//年月日取得
	public int getYear(){ 	return year;}
	public int getMonth(){	return month;}
	public int getDate(){	return date;}
	
	//年月日設定
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
	
	//インスタンスはうるう年？
	public boolean isLeap(){ return isLeap(year);}
	
	//曜日？	0:Sum ~ 6:Sat
	public int dayOfWeek(){
		int y = year;
		int m = month;
		
		if(m == 1 || m == 2){
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	//日付dと同じ？
	public boolean equalTo(Day d){
		return year == d.year && month == d.month && date == d.date;
	}
	
	//日付dより早い？
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
	
	//インスタンスは元日から何日目？
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
	//インスタンスの年内の残り日数？
	public int daysLeftInYear(){
		return daysLeftInYear(year, month, date);
	}
	
	//他の日付との前後関係を表示
	//~~~y年m月d日
	public void getRelationOf(int y, int m, int d){
		this.getRelationOf(new Day(y,m,d));
	}
	//~~~Day型d
	public void getRelationOf(Day d){
		if(equalTo(d)){
			System.out.println("同じ日付["+ this +"]です");
		}else if(earlierThan(d)){
			System.out.println(this + "は" + d + "より早い日付です");
		}else{
			System.out.println(this + "は" + d + "より遅い日付です");
		}
	}
	
	//日付を1日進める
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
	
	//日付をn日進める
	public void nDaysAfter(int n){
		for(int i = 0; i < n; i++){
			this.setNextDay();
		}
	}
	
	//日付を１日戻す
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
	
	//日付をn日戻す
	public void nDaysBefore(int n){
		for(int i = 0; i < n; i++){
			this.setLastDay();
		}
	}
	
	public String toString(){
		String[] wd = {"日","月","火","水","木","金","土"};
		return String.format("%04d年%02d月%02d日(%s)",
			year, month, date, wd[dayOfWeek()]);
	}
}
