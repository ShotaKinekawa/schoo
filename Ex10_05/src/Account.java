
public class Account {

	//インスタンス変数
	private String name ;
	private String no;
	private long balance;
	private Id id;
	
	//クラス初期化子
	{
		id = new Id();	
		System.out.println("口座開設ありがとうございます。");
	}
	
	//コンストラクタ
	public Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
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
