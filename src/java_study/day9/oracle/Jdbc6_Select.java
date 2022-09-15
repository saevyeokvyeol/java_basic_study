package java_study.day9.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jdbc6_Select {

	public static void main(String[] args) {
		Connection con = JdbcInit.getInstance().getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement(select());
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			
			for (int i = 1; i <= cols; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();

			List<User> data = new ArrayList<>();

			while (rs.next()) {
				User user = new User().setId(rs.getString(1)).setpassword(rs.getString(2));
				data.add(user);
			}
			
			Iterator<User> iterator = data.iterator();
			while (iterator.hasNext()) {
				User userinfo = iterator.next();
				System.out.println(userinfo.getId() + "\t" + userinfo.getpassword());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (con != null) con.close();
			} catch (Exception e) {
			}
		}

	}

	public static String select() {
//		String sql = "SELECT ID, password FROM test_table";
//		String sql = "SELECT ID, password FROM test_table WHERE ID ='yuda'";
		String sql = "SELECT * FROM test_table";
		return sql;
	}
}

class User {
	private String id;
	private String password;

	public String getId() {
		return id;
	}

	public String getpassword() {
		return password;
	}

	public User setId(String id) {
		this.id = id;
		return this;
	}

	public User setpassword(String password) {
		this.password = password;
		return this;
	}

}