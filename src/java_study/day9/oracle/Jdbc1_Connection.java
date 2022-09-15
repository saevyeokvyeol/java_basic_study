package java_study.day9.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc1_Connection {
	public Jdbc1_Connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			"com.mysql.cj.jdbc.Driver" // MySql
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "c##test", "test");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Jdbc1_Connection();
		System.out.println("test");
	}
}
