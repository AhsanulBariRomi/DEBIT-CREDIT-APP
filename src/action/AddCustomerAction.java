package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.CustomerManagementDAO;
import pojo.Customer;


public class AddCustomerAction extends ActionSupport {
	String name;
	String dob;
    Integer nid;
    String fathers_name; 
    String mothers_name; 
    Integer phone;
    String email;
    Integer accountNo;
    Integer accountBalance;
    
    public String execute() {
    	//System.out.println("AddCustomerAction execute() method Called");
    	String statusCode = "";
		Customer customer = new Customer(name, dob, nid, fathers_name, mothers_name, phone, email, accountNo, accountBalance);
		//System.out.println(customer);
		int recordAdded = CustomerManagementDAO.addCustomer(customer);
		//System.out.println("record Added:"+recordAdded);
		if (recordAdded == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getFathers_name() {
		return fathers_name;
	}

	public void setFathers_name(String fathers_name) {
		this.fathers_name = fathers_name;
	}

	public String getMothers_name() {
		return mothers_name;
	}

	public void setMothers_name(String mothers_name) {
		this.mothers_name = mothers_name;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}
    
    
}
