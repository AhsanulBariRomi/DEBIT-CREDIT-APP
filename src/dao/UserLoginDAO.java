package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;

import dbutil.DBUtil;
import pojo.Customer;
import pojo.Employee;
import pojo.UserLoginInfo;

public class UserLoginDAO {
	
	static UserLoginInfo user;
	
	public static boolean isUserValid(UserLoginInfo userDetails){
		boolean validStatus = false;
		try{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			ResultSet rs= st.executeQuery("SELECT * FROM user_login_info WHERE user_name = '"+userDetails.getUserName()+"' AND password = '"+userDetails.getPassword()+"'");
			
			while(rs.next()){
				validStatus = true;
				user = new UserLoginInfo(rs.getString("user_name"),rs.getString("password"),rs.getString("email"),rs.getString("role"));
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return validStatus;
	}
	
	public static UserLoginInfo getUser() {
		
		return user;
	} 
	
	public static int updatePassword (String name, String pass) {
		int status=0;
		try{
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call user_package.updatePassword(?,?)}");
			cs.setString(1,name);
			cs.setString(2,pass);
			
			status = cs.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static UserLoginInfo getUserByEmail(String email) {
		UserLoginInfo user = null;
		try{
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call user_package.searchByEmail(?,?,?,?)}");
			cs.registerOutParameter(1, java.sql.Types.VARCHAR);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.setString(3, email);
			cs.registerOutParameter(4, java.sql.Types.VARCHAR);
			
			int n = cs.executeUpdate();
			System.out.println(n);
			if(n==1)
				user = new UserLoginInfo (cs.getString(1), cs.getString(2), email, cs.getString(4));
			else
				user = null;
			System.out.println(user);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//System.out.println("getUserByEmail func");
		//System.out.println(user);
		
		return user;
	}
	
	public static int addUser(UserLoginInfo user){
		int status = 0;
		try{
			//System.out.println(user);
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call user_package.add(?,?,?,?)}");
			cs.setString(1,user.getUserName());
			cs.setString(2,user.getPassword());
			cs.setString(3,user.getEmail());
			cs.setString(4,user.getRole());
						
			status = cs.executeUpdate();
			
			//System.out.println("number of rows effected for add function call="+status);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	//////////////////////////......Employee......./////////////////////////////////////////////
	public static List<Employee> getAllEmploye(){
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM bank_employee"); 
			while(rs.next()) {
				Employee employee = new Employee(rs.getString("e_name"), rs.getString("e_email"), rs.getInt("e_phone"), rs.getString("e_blood"));
				employeeList.add(employee);
				//System.out.println(rs.getString("c_dob"));
			}
			
			DBUtil.closeConnection(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return employeeList;
	}
	
	public static Employee getEmployeeByEmail(String email) {
		Employee employee = null;
		try{
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call employee_package.searchByEmail(?,?,?,?)}");
			cs.registerOutParameter(1, java.sql.Types.VARCHAR);
			cs.setString(2, email);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.registerOutParameter(4, java.sql.Types.VARCHAR);
			
			int n = cs.executeUpdate();
			
			employee = new Employee (cs.getString(1),email,cs.getInt(3), cs.getString(4));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return employee;
	}
	
}
