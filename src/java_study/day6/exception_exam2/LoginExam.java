package java_study.day6.exception_exam2;

public class LoginExam {

	public static void main(String[] args) {
		try {
			login("red", "1234");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "4321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "1234");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIdException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIdException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("1234")) {
			throw new WrongPasswordException("비밀번호가 일치하지 않습니다.");
		}
		
		System.out.println("로그인 성공!");
	}
}
