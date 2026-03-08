package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert {

	public static void main(String[] args) {
		try {
			//1.Load and Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.Creating a connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		
			//3.Create Statement 
			Statement st = conn.createStatement();
			
			//4.Execute query
			
			//int n = st.executeUpdate("INSERT INTO customer VALUES('ahsanul', TO_DATE('1994/12/16', 'yyyy/mm/dd'), 123456789, 'Mr.bari','Mrs.bari', 01841352157, 'wakerbari@gmail.com', 159487, 50000)");
			//int n = st.executeUpdate("INSERT INTO user_login_info VALUES('romi','asd123','wakerbari@gmail.com','null')");
			//System.out.println("# of rows effected="+n);
			
			//5.close connection
			conn.close();
		}
		catch( Exception e ) {
			e.printStackTrace();
		}

	}

}
