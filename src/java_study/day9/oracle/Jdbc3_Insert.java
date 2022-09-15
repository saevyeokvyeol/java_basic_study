package java_study.day9.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc3_Insert {
	Connection con;
	
	public Jdbc3_Insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "c##test", "test");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		PreparedStatement ps = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("ID > ");
			String id = sc.nextLine();
			System.out.print("password > ");
			String pwd = sc.nextLine();
			
			ps = con.prepareStatement("insert into test_table values(?, ?)");
			ps.setString(1, id);
			ps.setString(2, pwd);
			
			int result = ps.executeUpdate();
			String msg = result > -1 ?  "데이터 추가 성공" : "데이터 추가 실패";
			System.out.println(msg);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {}
		}
	}
	
	public static void main(String[] args) {
		new Jdbc3_Insert().insert();
	}
}
