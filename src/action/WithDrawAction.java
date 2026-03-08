package action;

import dao.CustomerManagementDAO;
import pojo.Customer;

public class WithDrawAction {
	String name;
	String dob;
    Integer nid;
    String fathers_name; 
    String mothers_name; 
    Integer phone;
    String email;
    Integer accountNo;
    Integer accountBalance;
    
    Integer amount;
    
    public String execute() {
		String statusCode = "";
		//System.out.println("WithDrawAction execute() method called");
		//System.out.println(amount);
		//System.out.println(name);
		
		if(accountBalance<amount) {
			statusCode = "error";
		}
		
		else {
			accountBalance = accountBalance - amount;
			
			Customer customer = new Customer(name, dob, nid, fathers_name, mothers_name, phone, email, accountNo, accountBalance);
			//System.out.println(customer);
			int recordUpdated = CustomerManagementDAO.updateCustomer(customer);
			if (recordUpdated == 1) {
				statusCode = "success";
			} 
			else {
				statusCode = "error";
			}
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
   
}
