public class Ex10_05 {
	//List 10-2より
	public static void main(String[] args) {
		Account adachi = new Account("足立幸一",
				"123456", 1000);
		
		
		System.out.println("足立君の口座");
		System.out.println(" 口座名義：" + adachi.getName());
		System.out.println(" 口座番号：" + adachi.getNo());
		System.out.println(" 預金残高：" + adachi.getBalance());
		System.out.println(" 識別番号：" + adachi.getId());

		Account  nakata = new Account("仲田真二",
				"654321", 200);

		System.out.println("仲田君の口座");
		System.out.println(" 口座名義：" + nakata.getName());
		System.out.println(" 口座番号：" + nakata.getNo());
		System.out.println(" 預金残高：" + nakata.getBalance());
		System.out.println(" 識別番号：" + nakata.getId());
		
	}
}
