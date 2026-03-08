package action;

import java.util.Random;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserLoginDAO;

public class CreateUserAccDataAction extends ActionSupport {
	String email;
	String randPass;
	
	private final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
	private final char[] ALPHANUMERIC = (LETTERS + LETTERS.toUpperCase() + "0123456789").toCharArray();
	
	public void randomAlphanumericGenerate (int length) {
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<length;i++) {
			result.append(ALPHANUMERIC[new Random().nextInt(ALPHANUMERIC.length)]);
		}
		randPass = result.toString();
	}
	
	public String execute() {
		randomAlphanumericGenerate(5); 
		//System.out.println(randPass);
		return "success";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRandPass() {
		return randPass;
	}

	public void setRandPass(String randPass) {
		this.randPass = randPass;
	}
	
}
