package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbutil.DBUtil;
import pojo.AdminLoginInfo;

public class AdminLoginDAO {
	public static boolean isUserValid(AdminLoginInfo userDetails){
		boolean validStatus = false;
		try{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			ResultSet rs= st.executeQuery("SELECT * FROM admin_login_info WHERE user_name = '"+userDetails.getUserName()+"' AND password = '"+userDetails.getPassword()+"'");
		
			//System.out.println(userDetails.getUserName()+" "+userDetails.getPassword()); //jeta input dise sheta ekhane ashe kina check
			while(rs.next()){
				validStatus = true;
				//System.out.println(rs.getString("USER_NAME")+ " --> " +rs.getString("PASSWORD")); //dekhlam value ashe naki db read kore
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return validStatus;
	}
}
