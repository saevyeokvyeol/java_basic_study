package java_study.day6.exception_exam1;

public class BalanceExam {

	private int balance;
	public BalanceExam() {}
	
	public int getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
		System.out.println("잔액: " + balance);
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고 부족! 잔액: " + balance);
		}
		balance -= money;
		System.out.println("잔액: " + balance);
	}

	public static void main(String[] args) {
	}

}
