
public class Ex12_02 {
	static int compBalance(Account a, Account b) {
		long sumA = a.getBalance();
		long sumB = b.getBalance();

		if (a instanceof TimeAccount) {
			sumA += ((TimeAccount) a).getTimeBalance();
		}
		if (b instanceof TimeAccount) {
			sumB += ((TimeAccount) b).getTimeBalance();
		}

		if (sumA > sumB) {
			return 1;
		} else if (sumA == sumB) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 700, 500);

		switch (compBalance(adachi, nakata)) {
		case 0:
			System.out.println("足立さんと仲田さんの預金残高は同じ。");
			break;
		case 1:
			System.out.println("足立さんの方が預金残高は多い。");
			break;
		case -1:
			System.out.println("仲田さんの方が預金残高は多い。");
			break;
		}

	}
}
