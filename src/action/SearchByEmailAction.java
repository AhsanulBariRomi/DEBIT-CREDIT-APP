package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserLoginDAO;
import pojo.Employee;

public class SearchByEmailAction extends ActionSupport {
	  String email;
	  
	  String name;
	  Integer phone;
	  String blood;
	  
	  public String execute() {
		  Employee employee = UserLoginDAO.getEmployeeByEmail(email);
		  name = employee.getName();
		  email = employee.getEmail();
		  phone = employee.getPhone();
		  blood = employee.getBlood();
		  
		  return "success";
	  }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}
	  
}
