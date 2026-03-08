package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import pojo.Customer;


public class CustomerManagementDAO {
	
	public static List<Customer> getAllCustomer(){
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM customer"); 
			while(rs.next()) {
				Customer customer = new Customer(rs.getString("c_name"), rs.getString("c_dob"), rs.getInt("c_nid"), rs.getString("fathers_name"),
						rs.getString("mothers_name"),rs.getInt("c_phone"),rs.getString("c_email"), rs.getInt("c_account_no"), rs.getInt("c_account_balance"));
				customerList.add(customer);
				//System.out.println(rs.getString("c_dob"));
			}
			
			DBUtil.closeConnection(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return customerList;
	}
	
	public static int addCustomer(Customer customer){
		int status = 0;
		try{
			//System.out.println(customer);
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call customer_package.add(?,?,?,?,?,?,?,?,?)}");
			cs.setString(1,customer.getName());
			cs.setDate(2, java.sql.Date.valueOf(customer.getDob()));
			cs.setInt(3,customer.getNid());
			cs.setString(4,customer.getFathers_name());
			cs.setString(5,customer.getMothers_name());
			cs.setInt(6,customer.getPhone());
			cs.setString(7,customer.getEmail());
			cs.setInt(8,customer.getAccountNo());
			cs.setInt(9,customer.getAccountBalance());
			
			status = cs.executeUpdate();
			
			//System.out.println("number of rows effected for add function call="+status);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
///////////////..............DELETE.............../////////////////////////////////////////////////////////////////////////////////////////////
	public static int deleteCustomer(Integer accountNo){
		int status = 0;
		try{
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call customer_package.del(?)}");
			cs.setInt(1, accountNo);
			
			status = cs.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////..............UPDATE...............//////////////////////////////////////////////////////////////////////////////////////////
	public static Customer getCustomerByAccNo(Integer accountNo){
		Customer customer = null;
		try{
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call customer_package.searchByAccNo(?,?,?,?,?,?,?,?,?)}");
			cs.registerOutParameter(1, java.sql.Types.VARCHAR);
			cs.registerOutParameter(2, java.sql.Types.DATE);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.registerOutParameter(4, java.sql.Types.VARCHAR);
			cs.registerOutParameter(5, java.sql.Types.VARCHAR);
			cs.registerOutParameter(6, java.sql.Types.INTEGER);
			cs.registerOutParameter(7, java.sql.Types.VARCHAR);
			cs.setInt(8, accountNo);
			cs.registerOutParameter(9, java.sql.Types.INTEGER);
			
			int n = cs.executeUpdate();
			String s = cs.getDate(2).toString();
			customer = new Customer(cs.getString(1),s,cs.getInt(3),cs.getString(4),cs.getString(5),cs.getInt(6),cs.getString(7),accountNo,cs.getInt(9));
			//System.out.println(customer);
			/*while(rs.next()){
				product = new Product(rs.getString("prod_id"),rs.getString("prod_name"),rs.getString("prod_category"),rs.getInt("prod_price"));
			}*/
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return customer;
	}
	
	public static int updateCustomer(Customer customer){
		int status = 0;
		try{
			//System.out.println("DAO updateCustomer()");
			//System.out.println(customer);
			Connection conn = DBUtil.getConnection();
			CallableStatement cs= conn.prepareCall("{call customer_package.updateByAccNo(?,?,?,?,?,?,?,?,?)}");
			cs.setString(1,customer.getName());
			cs.setDate(2, java.sql.Date.valueOf(customer.getDob()));
			cs.setInt(3,customer.getNid());
			cs.setString(4,customer.getFathers_name());
			cs.setString(5,customer.getMothers_name());
			cs.setInt(6,customer.getPhone());
			cs.setString(7,customer.getEmail());
			cs.setInt(8,customer.getAccountNo());
			cs.setInt(9,customer.getAccountBalance());			
			
			status = cs.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
