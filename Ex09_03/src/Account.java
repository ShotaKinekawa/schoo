
public class Account {

	//インスタンス変数
	private String name ;
	private String no;
	private long balance;
	private Day openDay;

	//クラス初期化子

	
	//コンストラクタ
	public Account(String n, String num, long z, Day day) {
		name = n;
		no = num;
		balance = z;
		openDay = day;
	}
	

	/**
	 * @return openDay
	 */
	public Day getOpenDay() {
		return openDay;
	}


	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public long getBalance() {
		return balance;
	}
		
	public void deposit(long k) {
		balance += k;
	}
	
	public void withdraw(long k) {
		balance -= k;
	}


	@Override
	public String toString() {
		return "Account [名前：" + name + ", 口座番号：" + no + ", 残高：" + balance + ", 開設日：" + openDay + "]";
	}
	
}
