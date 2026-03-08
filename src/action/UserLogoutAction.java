package action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UserLogoutAction extends ActionSupport{
	public String execute() {
		ServletActionContext.getRequest().getSession().invalidate();
		return "input";
	}
}
