package dbutil;

import java.sql.*;

public class DBUtil {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
