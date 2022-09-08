package java_study.day6.exception_exam2;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
