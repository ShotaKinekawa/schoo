public class Ex10_05 {
	//List 10-2���
	public static void main(String[] args) {
		Account adachi = new Account("�����K��",
				"123456", 1000);
		
		
		System.out.println("�����N�̌���");
		System.out.println(" �������`�F" + adachi.getName());
		System.out.println(" �����ԍ��F" + adachi.getNo());
		System.out.println(" �a���c���F" + adachi.getBalance());
		System.out.println(" ���ʔԍ��F" + adachi.getId());

		Account  nakata = new Account("���c�^��",
				"654321", 200);

		System.out.println("���c�N�̌���");
		System.out.println(" �������`�F" + nakata.getName());
		System.out.println(" �����ԍ��F" + nakata.getNo());
		System.out.println(" �a���c���F" + nakata.getBalance());
		System.out.println(" ���ʔԍ��F" + nakata.getId());
		
	}
}
