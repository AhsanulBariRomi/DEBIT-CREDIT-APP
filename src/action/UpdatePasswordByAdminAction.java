package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserLoginDAO;

public class UpdatePasswordByAdminAction extends ActionSupport {
	String userName;
	String password;
	
	public String execute() {
		String statusCode = "";
		
		int recordUpdated = UserLoginDAO.updatePassword(userName,password);
		//System.out.println("UpdatePasswordbyAdmin Action execute called");
		//System.out.println(userName+" "+password);
		if (recordUpdated == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
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
