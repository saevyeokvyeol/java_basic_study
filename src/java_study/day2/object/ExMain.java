package java_study.day2.object;

public class ExMain {

	public static void main(String[] args) {
		Ex4 ex = new Ex4();
		boolean state = ex.login("yuda", "0202");
		
		if (state) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
		}
		
		ex.logout("yuda");
	}

}
