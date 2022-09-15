package java_study.day9.oracle;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc4_Update {

	
	public String update() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID > ");
		String id = sc.next();
		System.out.print("password > ");
		String password = sc.next();
		String sql = "UPDATE test_table SET password = '" + password + "' WHERE ID = '" + id + "'"; 
		return sql;
	}
	
	public void update(String sql) {
		Statement stmt = null;
		Connection con = JdbcInit.getInstance().getConnection();
		try {
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			String msg = result > -1 ? "데이터 수정 성공" : "데이터 수정 실패";
			System.out.println(msg);
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(SQLException e) {}
		}
	}

	public static void main(String[] args) {
		Jdbc4_Update ex31 = new Jdbc4_Update();
		ex31.update(ex31.update());
	}
}
