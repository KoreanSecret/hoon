package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
       
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			//1,2
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user , password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
