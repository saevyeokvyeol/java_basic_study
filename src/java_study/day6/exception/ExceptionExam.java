package java_study.day6.exception;

public class ExceptionExam {
	String str = "";
	
	public void foo(int i) {
		try {
			if (i == 1) {
				throw new Exception();
			}
			str += " 1 ";
		} catch (Exception e) {
			str += " 2 ";
			return;
		} finally {
			str += " 3 ";
		}
		str += " 4 ";
	}
	
	public static void main(String[] args) {
		ExceptionExam exceptionExam = new ExceptionExam();
		exceptionExam.foo(0);
		exceptionExam.foo(1);
		
		System.out.println(exceptionExam.str);
		// 1 3 4 2 3
	}

}
