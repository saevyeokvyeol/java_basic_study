package java_study.day9.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbc5_Delete {
	
	public static String delete() {
		String sql = "DELETE FROM test_table WHERE ID = ?";
		return sql;
	}

	public static void main(String[] args) {
		Connection con = JdbcInit.getInstance().getConnection();
		PreparedStatement ps = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("ID :");
		String id = sc.nextLine();

		try {
			ps = con.prepareStatement(delete());
			ps.setString(1, id);
			int result = ps.executeUpdate();
			
			String msg = result > -1 ? "데이터 삭제 성공" : "데이터 삭제 실패";
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println("데이터 베이스 드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
}
