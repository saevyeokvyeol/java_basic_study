package java_study.day9.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2_CreateTable {
	Connection con;
	
	public Jdbc2_CreateTable() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "c##test", "test");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void createTable() {
		Statement statement = null;
		try {
			statement = con.createStatement();
			int result = statement.executeUpdate("create table test_table(ID varchar2(50), password varchar2(50))");
			
			if(result < 0) {
				System.out.println("테이블 생성 실패");
			} else {
				System.out.println("테이블 생성 성공");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
				if(con != null) con.close();
			} catch (SQLException e) {}
		}
	}
	
	public static void main(String[] args) {
		new Jdbc2_CreateTable().createTable();
	}
}
