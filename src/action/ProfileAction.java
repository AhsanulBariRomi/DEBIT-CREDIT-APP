package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserLoginDAO;
import pojo.UserLoginInfo;

public class ProfileAction extends ActionSupport {
	UserLoginInfo user;
	
	public void initializeUser() {
		user = UserLoginDAO.getUser();
		//System.out.println(user);
	}
	
	public String execute() {
		initializeUser();
		return "success";
	}

	public UserLoginInfo getUser() {
		return user;
	}

	public void setUser(UserLoginInfo user) {
		this.user = user;
	}	
}
