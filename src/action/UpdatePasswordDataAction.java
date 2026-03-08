package action;

import com.opensymphony.xwork2.ActionSupport;

public class UpdatePasswordDataAction extends ActionSupport {
	
	String userName;
	
	public String execute() {
		//this.userName = userName;
		//System.out.println("UpdatePasswordDataAction execute");
		return "success";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
