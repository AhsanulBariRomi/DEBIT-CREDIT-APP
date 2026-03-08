package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.CustomerManagementDAO;
import dao.UserLoginDAO;
import pojo.Customer;
import pojo.Employee;

public class AdminWelcomAction extends ActionSupport {
	List<Employee> employee;
	
	public void initializeEmployee() {
		employee = UserLoginDAO.getAllEmploye();
	}
	
	public String execute() {
		initializeEmployee();
		return "success";
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
