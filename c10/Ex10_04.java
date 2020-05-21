import java.util.Scanner;

public class Ex10_04{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		
		//Day型インスタンスを利用した動作確認
		System.out.println("日付を入力せよ。(Day型インスタンスメソッド)");
		System.out.print("年:");
		int	y = stdIn.nextInt();
		System.out.print("月:");
		int m = stdIn.nextInt();
		System.out.print("日:");
		int d = stdIn.nextInt();
		
		Day a = new Day(y, m, d);
		System.out.println(a + "として生成しました。");
		System.out.println(a.getYear() + "年は閏年" +
			(a.isLeap()? "です。": "ではありません。"));
		System.out.println("元日から" + a.nthDayFromNewYearTo()
			+ "日経過しています。");
		System.out.println("年内残り" + a.daysLeftInYear()
			+ "日です。");
		
		Day b = new Day(a);
		b.setLastDay();
		System.out.println("前日(インスタンスメソッド)は" + b + "、");
		System.out.println("前日(クラスメソッド)は" + Day.lastDay(a) + "です。");
		Day c = new Day(a);
		c.setNextDay();
		System.out.println("翌日(インスタンスメソッド)は" + c + "、");
		System.out.println("翌日(クラスメソッド)は" + Day.nextDay(a) + "です。");
		
		int n;
		do{
			System.out.print("\n正の整数値：");
			 n = stdIn.nextInt();
		}while(n < 1);
		Day e = new Day(a);
		e.nDaysBefore(n);
		System.out.println(n +"日前の日付は(インスタンスメソッドで)" + e + "、");
		System.out.println(n +"日前の日付は(クラスメソッドで)" + Day.nDaysBefore(n, a) + "です。");
		
		Day f = new Day(a);
		f.nDaysAfter(n);
		System.out.println(n +"日後の日付は(インスタンスメソッドで)" + f + "、");
		System.out.println(n +"日後の日付は(クラスメソッドで)" + Day.nDaysAfter(n, a) + "です。");
		
		
		//クラスメソッドを中心とした動作確認
		System.out.println();
		System.out.println("日付を入力せよ。(Day型クラスメソッド)");
		System.out.print("年:");
			y = stdIn.nextInt();
		System.out.print("月:");
			m = stdIn.nextInt();
		System.out.print("日:");
			d = stdIn.nextInt();
		System.out.println("その年は閏年" + 
			(Day.isLeap(y)? "です。": "ではありません。"));
		System.out.println("元日から" + Day.nthDayFromNewYearTo(y,m,d)
			+ "日経過しています。");
		System.out.println("年内残り" + Day.daysLeftInYear(y,m,d)
			+ "日です。");
		System.out.println("前日は" + Day.lastDay(y,m,d) + "、");
		System.out.println("翌日は" + Day.nextDay(y,m,d) + "です。");
		
		
		
		
		System.out.println("インスタンスメソッド");
		a.getRelationOf(y,m,d);
		//System.out.println();
		//Day.getRelationOf(a, y, m, d);
		System.out.println("クラスメソッド");
		Day.getRelationOf(a.getYear(),a.getMonth(),a.getDate(), y, m, d);
		
		
	}
	
}
