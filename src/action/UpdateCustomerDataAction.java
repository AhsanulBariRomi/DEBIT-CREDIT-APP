package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.CustomerManagementDAO;

import pojo.Customer;

public class UpdateCustomerDataAction extends ActionSupport{
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
		//System.out.println("UpdateCustomerDataAction execute() method called");
		Customer customer = CustomerManagementDAO.getCustomerByAccNo(accountNo);
		name = customer.getName();
		dob = customer.getDob();
		nid = customer.getNid();
		fathers_name = customer.getFathers_name();
		mothers_name = customer.getMothers_name();
		phone = customer.getPhone();
		email = customer.getEmail();
		accountNo = customer.getAccountNo();
		accountBalance = customer.getAccountBalance();
	    
	   // System.out.println(name+ " " + dob);
		return "success";
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
