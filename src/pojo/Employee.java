package pojo;

public class Employee {
	String name;
	String email;
	Integer phone;
	String blood;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String email, Integer phone, String blood) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.blood = blood;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phone=" + phone + ", blood=" + blood + "]";
	}
	
	
}
