package action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserLoginDAO;
import pojo.UserLoginInfo;

public class UserLoginAction extends ActionSupport{
	
	String userName;
	String password;
	String msg;
	
	public String execute() {
		String statusCode = "";
		msg="...";
		//System.out.println("UserLoginAction execute() method called");
		
		boolean isUserValid = UserLoginDAO.isUserValid(new UserLoginInfo(userName, password, "a", "a"));
		
		ServletActionContext.getRequest().getSession().setAttribute("loggedinUser","userName");
		
		if (isUserValid) {
			statusCode = "success";
		} 
		else {
			msg = "ERROR:incorrect userid or password ";
			statusCode = "input";
		}
		return statusCode;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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
