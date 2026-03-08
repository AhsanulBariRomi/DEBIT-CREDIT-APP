package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserLoginDAO;
import pojo.UserLoginInfo;

public class EmpToUserAction extends ActionSupport {
	
	UserLoginInfo user;
	String email;
	
	public void initializeUser() {
		user = UserLoginDAO.getUserByEmail(email);
		//System.out.println(user);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String execute() {
		initializeUser();
		if(user==null)
			return "error";
		else
			return "success";
	}

	public UserLoginInfo getUser() {
		return user;
	}

	public void setUser(UserLoginInfo user) {
		this.user = user;
	}	
	
}
