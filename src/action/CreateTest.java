package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTest {

	public static void main(String[] args) {
			try {
				System.out.println("Connection to Database...");
				
				//1.Load and Register the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//2.Creating a connection
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				System.out.println("Connection Established");
				
				//3.Create Statement 
				Statement st = conn.createStatement();
				System.out.println("Statement Created");
				
				//4.Execute query
				//int n = st.executeUpdate("CREATE TABLE customer(c_name varchar2(30) NOT NULL,c_dob date NOT NULL,c_nid number(10) NOT NULL,fathers_name varchar2(30) NOT NULL,mothers_name varchar2(30) NOT NULL,c_phone number NOT NULL,c_email varchar2(30),c_account_no number(10) NOT NULL,c_account_balance number(10) NOT NULL,PRIMARY KEY (c_account_no))");
						
				//System.out.println("Query Executed");
				//System.out.println("# of rows effected="+n);
				
				//5.close connection
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
