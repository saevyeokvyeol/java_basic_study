package java_study.day2.object;

public class ExMain {

	public static void main(String[] args) {
		Ex4 ex = new Ex4();
		boolean state = ex.login("yuda", "0202");
		
		if (state) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		} else {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
		}
		
		ex.logout("yuda");
	}

}
