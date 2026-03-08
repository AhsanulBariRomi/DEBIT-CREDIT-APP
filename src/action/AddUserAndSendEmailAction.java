package action;

import java.util.Properties;

import com.opensymphony.xwork2.ActionSupport;

import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import dao.CustomerManagementDAO;
import dao.UserLoginDAO;
import pojo.Customer;
import pojo.UserLoginInfo;

public class AddUserAndSendEmailAction extends ActionSupport{
	
	String myEmail;
	String myPass;
	
	String email;
	String userName;
	String role;
	String randPass;
	
	String subject="User id and Password";
	String body = email+" "+randPass;
	
	static Properties properties=new Properties();
	
	static {
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port","465");
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth","true");
		properties.put("mail.smtp.port","465");
	}
	
	public String execute() {
		
		String statusCode = "";
		Boolean flag = false;
		UserLoginInfo user = new UserLoginInfo (userName, email, randPass, role);
		int recordAdded = UserLoginDAO.addUser(user);
		
		if (recordAdded == 1) {
			statusCode = "success";
		} 
		
		else {
			statusCode = "error";
		}
		
		
		try {
			Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(myEmail,myPass);
				}
			});
			System.out.println(myEmail);
			System.out.println(subject);
			System.out.println(body);
			
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress(myEmail));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
			message.setSubject(subject);
			message.setText(body);
			Transport.send(message);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return statusCode;
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRandPass() {
		return randPass;
	}

	public void setRandPass(String randPass) {
		this.randPass = randPass;
	}



	public String getMyEmail() {
		return myEmail;
	}



	public void setMyEmail(String myEmail) {
		this.myEmail = myEmail;
	}



	public String getMyPass() {
		return myPass;
	}



	public void setMyPass(String myPass) {
		this.myPass = myPass;
	}



	public static Properties getProperties() {
		return properties;
	}



	public static void setProperties(Properties properties) {
		AddUserAndSendEmailAction.properties = properties;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}
	
}
