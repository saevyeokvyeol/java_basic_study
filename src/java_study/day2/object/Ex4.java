package java_study.day2.object;

public class Ex4 {
	public Ex2 member;
//	Ex2[] ex2 = new Ex2[2];
	
	public Ex4() {
		member = new Ex2("������", "yuda", "0202");
//		ex2[0] = member;
	}
	
	public boolean login(String id, String pw) {
		boolean state = false;
		
		if(id.equals(member.getId()) && pw.equals(member.getPw())) {
			state = true;
			System.out.println(member.getName() + "��");
		}
		
		return state;
	}
	
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
