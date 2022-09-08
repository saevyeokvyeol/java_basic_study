package java_study.day6.exception_exam1;

public class BalanceMain {

	public static void main(String[] args) {
		BalanceExam exam = new BalanceExam();
		exam.deposit(10000);
		
		try {
			exam.withdraw(50000);
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
