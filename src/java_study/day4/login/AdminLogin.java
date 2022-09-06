package java_study.day4.login;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class AdminLogin {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Properties properties = getAdminInfo();
		String adminId = properties.getProperty("username");
		String adminPassword = properties.getProperty("password");
		map.put(adminId, adminPassword);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("ID > ");
			String id = scanner.nextLine();
			System.out.print("password > ");
			String password = scanner.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} else {
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			}
		}
	}
	
	public static Properties getAdminInfo() {
		Properties properties = null;
		try {
			properties = new Properties();
			String path = AdminLogin.class.getResource("database.properties").getPath();
			path = URLDecoder.decode(path, "UTF-8");
			properties.load(new FileReader(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}

}
