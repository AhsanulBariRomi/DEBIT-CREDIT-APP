package action;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

import pojo.Customer;

import pojo.UserLoginInfo;

import dao.CustomerManagementDAO;

import dao.UserLoginDAO;

public class UserWelcomeAction extends ActionSupport{
	
	//UserLoginInfo user;
	List<Customer> customers;
	
	/*public void initializeUser() {
		user = UserLoginDAO.getUser();
		System.out.println(user);
	}*/
	public void initializeCustomers() {
		customers = CustomerManagementDAO.getAllCustomer();
		//System.out.println(customers); //dekhlam customer value ashe kina 
	}
	
	/*public UserLoginInfo getUser() {
		return user;
	}
	public void setUser(UserLoginInfo user) {
		this.user = user;
	}*/
	public String execute() {
		//System.out.println("userwelcome action executed");
		initializeCustomers();
		//initializeUser();
		return "success";
	}

	public List<Customer> getCustomer() {
		return customers;
	}

	public void setCustomer(List<Customer> customer) {
		this.customers = customer;
	}
	
}
