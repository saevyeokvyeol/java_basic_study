package java_study.day6.exception_exam2;

public class NotExistIdException extends Exception {
	public NotExistIdException() {}
	public NotExistIdException(String message) {
		super(message);
	}
}
