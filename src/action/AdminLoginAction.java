package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminLoginDAO;
import pojo.AdminLoginInfo;

public class AdminLoginAction extends ActionSupport {
	
	String userName;
	String password;
	
	public String execute() {
		String statusCode = "";
		//System.out.println("AdminLoginAction execute() method called");
		boolean isUserValid = AdminLoginDAO.isUserValid(new AdminLoginInfo(userName, password));
		if (isUserValid) {
			statusCode = "success";
		} else {
			statusCode = "input";
		}
		return statusCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
