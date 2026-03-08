package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.CustomerManagementDAO;

public class DeleteCustomeAction extends ActionSupport {
	Integer accountNo;
	
	public String execute() {
		String statusCode = "";
		System.out.println("DeleteCustomerAction execute() method called");
		System.out.println(" accountNo = "+accountNo);
		int recordUpdated = CustomerManagementDAO.deleteCustomer(accountNo);
		if (recordUpdated == 1) {
			statusCode = "success";
		} 
		else {
			statusCode = "error";
		}
		return statusCode;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	
	
}
