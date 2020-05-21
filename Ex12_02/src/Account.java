
public class Account {
	private String name;
	private String no;
	private long balance;
	private Id id;

	{
		id = new Id();
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	// コンストラクタ
	public Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
	}

	// インスタンスメソッド
	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public int getId() {
		return id.getID();
	}

	public void deposit(long k) {
		balance += k;
	}

	public void withdraw(long k) {
		balance -= k;
	}
}
