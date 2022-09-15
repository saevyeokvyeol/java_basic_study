package java_study.day9.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcInit {
	private static JdbcInit instance;
	private Connection con;
	
	public JdbcInit() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "c##test", "test");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static JdbcInit getInstance() {
		if(instance == null) instance = new JdbcInit();
		return instance;
	} 
	
	public Connection getConnection() {
		return this.con;
	}
}
